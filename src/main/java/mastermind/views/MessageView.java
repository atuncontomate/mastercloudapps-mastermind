package mastermind.views;

import mastermind.models.Message;
import utils.WithConsoleView;

public class MessageView extends WithConsoleView {

    private Message message;

    public MessageView(Message message){
        this.message = message;
    }

    public void write() {
        this.console.write(message.getContent());
    }

    public void writeln() {
        this.console.writeln(message.getContent());
    }

    public void writeln(int blacks, int whites) {
        assert message == Message.RESULT;
        this.console.writeln(message.getContent().replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }
}
