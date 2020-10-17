package mastermind.views.console;

import mastermind.models.Message;
import mastermind.models.Result;
import utils.WithConsoleView;

public class ResultView extends WithConsoleView {

    private Result result;

    public ResultView(Result result){
        this.result = result;
    }

    public void writeln() {
        new MessageView(Message.RESULT).writeln(result.getBlacks(), result.getWhites());
    }
}
