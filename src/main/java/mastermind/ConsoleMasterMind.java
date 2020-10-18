package mastermind;

import mastermind.controller.ProposalController;
import mastermind.controller.ResumeController;
import mastermind.views.MainView;
import mastermind.views.console.ConsoleMainView;

public class ConsoleMasterMind extends MasterMind{

    @Override
    protected MainView createView(ProposalController proposalController,
                                  ResumeController resumeController) {
        return new ConsoleMainView(proposalController, resumeController);
    }

    public static void main(String[] args) {
        new ConsoleMasterMind().play();
    }

}
