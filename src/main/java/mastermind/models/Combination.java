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

    public static int getWidth(){
        return COMBINATION_LENGTH;
    }
}
