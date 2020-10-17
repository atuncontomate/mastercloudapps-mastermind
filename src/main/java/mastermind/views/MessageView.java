package mastermind.views;

import mastermind.models.Message;
import utils.Console;

public class MessageView {

    private Message message;

    public MessageView(Message message){
        this.message = message;
    }

    public void write() {
        Console.instance().write(message.getContent());
    }

    public void writeln() {
        Console.instance().writeln(message.getContent());
    }

    public void writeln(int blacks, int whites) {
        assert message == Message.RESULT;
        Console.instance().writeln(message.getContent().replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }
}
