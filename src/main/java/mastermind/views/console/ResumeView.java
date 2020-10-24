package mastermind.views.console;

import mastermind.controllers.ResumeController;
import mastermind.models.Message;
import utils.WithConsoleView;
import utils.YesNoDialog;

public class ResumeView extends WithConsoleView {

    public boolean interact(ResumeController resumeController) {
        new MessageView(Message.RESUME).write();
        boolean isResumed = new YesNoDialog().read(Message.RESUME.toString());
        resumeController.resume(isResumed);
        return isResumed;
    }
}
