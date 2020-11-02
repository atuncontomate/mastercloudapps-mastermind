package mastermind.views;

import mastermind.types.Message;
import utils.YesNoDialog;

public class ResumeView {

    public boolean read() {
        Message.RESUME.write();
        return new YesNoDialog().read(Message.RESUME.toString());
    }
}
