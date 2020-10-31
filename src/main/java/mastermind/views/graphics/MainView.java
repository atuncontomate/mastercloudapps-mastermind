package mastermind.views.graphics;

import mastermind.controllers.*;

public class MainView extends mastermind.views.MainView implements ControllerVisitor {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public MainView() {
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
