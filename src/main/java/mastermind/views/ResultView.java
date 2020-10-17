package mastermind.views;

import mastermind.models.Message;
import mastermind.models.Result;

public class ResultView {

    private Result result;

    public ResultView(Result result){
        this.result = result;
    }

    public void writeln() {
        new MessageView(Message.RESULT).writeln(result.getBlacks(), result.getWhites());
    }
}
