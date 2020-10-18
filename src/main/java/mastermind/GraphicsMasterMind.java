package mastermind;

import mastermind.controller.ProposalController;
import mastermind.controller.ResumeController;
import mastermind.views.MainView;
import mastermind.views.graphics.GraphicsMainView;

public class GraphicsMasterMind extends MasterMind{

    @Override
    protected MainView createView(ProposalController proposalController,
                                  ResumeController resumeController) {
        return new GraphicsMainView(proposalController, resumeController);
    }

    public static void main(String[] args) {
        new GraphicsMasterMind().play();
    }

}
