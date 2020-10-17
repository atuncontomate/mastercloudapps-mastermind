package mastermind.views.console;

import mastermind.models.Color;
import utils.WithConsoleView;

public class ColorView extends WithConsoleView {

    private Color color;

    public ColorView(Color color){
        this.color = color;
    }

    void write() {
        assert color != Color.NULL_COLOR;
        this.console.write(color.getInitial());
    }
}
