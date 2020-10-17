package mastermind.views;

import mastermind.models.Error;
import utils.WithConsoleView;

public class ErrorView extends WithConsoleView {

    private Error error;

    public ErrorView (Error error){
        this.error = error;
    }

    public void writeln() {
        assert error != Error.NULL_ERROR;
        this.console.writeln(error.getMessage());
    }
}
