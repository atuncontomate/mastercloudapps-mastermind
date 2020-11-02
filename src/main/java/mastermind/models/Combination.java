package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Combination {

    public static final int COMBINATION_LENGTH = 4;

    protected List<Color> colors;

    protected Combination (){
        this.colors = new ArrayList<Color>();
    }

    public List<Color> getColors(){
        return colors;
    }

    public boolean containsColorAt(Combination combination, int i){
        return this.colors.contains(combination.colors.get(i));
    }

    public boolean matchesColorAt(Combination combination, int i){
        assert i >= 0 && i < getWidth();
        return this.colors.get(i).equals(combination.colors.get(i));
    }

    public static int getWidth(){
        return COMBINATION_LENGTH;
    }

}
