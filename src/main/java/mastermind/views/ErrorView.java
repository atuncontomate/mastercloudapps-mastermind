package mastermind.views;

import mastermind.models.Error;
import utils.Console;

public class ErrorView {

    private Error error;

    public ErrorView (Error error){
        this.error = error;
    }

    public void writeln() {
        assert error != Error.NULL_ERROR;
        Console.instance().writeln(error.getMessage());
    }
}
