package mastermind.views.console;

import mastermind.models.Color;
import utils.Console;

public class ColorView {

    private Color color;

    public ColorView(Color color){
        this.color = color;
    }

    void write() {
        assert color != Color.NULL_COLOR;
        Console.instance().write(color.getInitial());
    }
}
