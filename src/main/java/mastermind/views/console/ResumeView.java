package mastermind.views.console;

import mastermind.controller.ResumeController;
import mastermind.models.Message;
import utils.WithConsoleView;
import utils.YesNoDialog;

public class ResumeView extends WithConsoleView {

    public boolean interact(ResumeController resumeController) {
        new MessageView(Message.RESUME).write();
        boolean newGame = new YesNoDialog().read(Message.RESUME.toString());
        if (newGame) {
            resumeController.clear();
        } else {
            resumeController.next();
        }
        return newGame;
    }
}
