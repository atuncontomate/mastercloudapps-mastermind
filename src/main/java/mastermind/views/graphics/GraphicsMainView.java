package mastermind.views.graphics;

import mastermind.controllers.*;
import mastermind.views.MainView;

public class GraphicsMainView extends MainView implements ControllerVisitor {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public GraphicsMainView() {
        this.startView = new StartView();
        this.proposalView = new ProposalView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(AcceptorController controller){
        controller.accept(this);
    }

    public void visit(StartController startController) {
        this.startView.interact(startController);
    }

    public void visit(ProposalController proposalController) {
        this.proposalView.interact(proposalController);	}

    public void visit(ResumeController resumeController) {
        this.resumeView.interact(resumeController);
    }

}
