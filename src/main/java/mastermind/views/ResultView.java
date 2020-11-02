package mastermind.views;

import mastermind.types.Message;
import mastermind.models.Result;

public class ResultView {

    private Result result;

    public ResultView(Result result){
        this.result = result;
    }

    public void writeln() {
        Message.RESULT.writeln(result.getBlacks(), result.getWhites());
    }
}
