package mastermind.views.console;

import mastermind.controller.ResumeController;
import mastermind.models.Message;
import utils.WithConsoleView;
import utils.YesNoDialog;

public class ResumeView extends WithConsoleView {

    private ResumeController resumeController;

    public ResumeView(ResumeController resumeController) {
        this.resumeController = resumeController;
    }

    public boolean interact() {
        new MessageView(Message.RESUME).write();
        boolean newGame = new YesNoDialog().read(Message.RESUME.toString());
        if (newGame) {
            this.resumeController.clear();
        }
        return newGame;
    }
}
