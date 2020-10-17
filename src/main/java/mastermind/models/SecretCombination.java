package mastermind.models;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SecretCombination extends Combination{

    public SecretCombination() {
        super();
        for(int i=0; i<Color.length(); i++) {
            this.colors.add(Color.get(i));
        }
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < Color.length() - COMBINATION_LENGTH; i++) {
            this.colors.remove(random.nextInt(this.colors.size()));
        }
        Collections.shuffle(this.colors);
    }

    public Result getResult(Combination proposedCombination){
        List<Color> proposedColors = proposedCombination.colors;
        int blacks = 0;
        int whites = 0;

        if(proposedCombination.colors.size() == COMBINATION_LENGTH){

            for(int i=0; i<COMBINATION_LENGTH; i++){
                if(proposedColors.get(i).equals(this.colors.get(i))){
                    blacks++;
                } else if(this.colors.contains(proposedColors.get(i))) {
                    whites++;
                }
            }
        }

        return new Result(blacks, whites);
    }
}
