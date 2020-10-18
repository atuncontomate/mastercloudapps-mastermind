package mastermind.views.graphics;

import mastermind.controller.Controller;
import mastermind.controller.ProposalController;
import mastermind.controller.ResumeController;
import mastermind.controller.StartController;
import mastermind.views.MainView;

public class GraphicsMainView extends MainView {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public GraphicsMainView() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(Controller controller){
        if (controller instanceof StartController) {
            this.startView.interact((StartController) controller);
        } else if (controller instanceof ProposalController){
            this.proposalView.interact((ProposalController) controller);
        } else {
            this.resumeView.interact((ResumeController) controller);
        }
    }

}
