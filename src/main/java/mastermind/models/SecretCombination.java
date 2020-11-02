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
        int blacks = 0;
        int whites = 0;

        if(proposedCombination.colors.size() == COMBINATION_LENGTH){
            for(int i=0; i<COMBINATION_LENGTH; i++){
                if(this.matchesColorAt(proposedCombination, i)){
                    blacks++;
                } else if(this.containsColorAt(proposedCombination, i)) {
                    whites++;
                }
            }
        }

        return new Result(blacks, whites);
    }
}
