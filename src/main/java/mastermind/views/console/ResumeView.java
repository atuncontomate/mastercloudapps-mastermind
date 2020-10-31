package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.views.Message;
import utils.YesNoDialog;

public class ResumeView {

    public void interact(ResumeController resumeController) {
        Message.RESUME.write();
        boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
        resumeController.resume(isResumed);
    }
}
