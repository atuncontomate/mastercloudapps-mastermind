package mastermind.views.graphics;

import mastermind.controller.ProposalController;
import mastermind.controller.ResumeController;
import mastermind.views.MainView;

public class GraphicsMainView extends MainView {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public GraphicsMainView(ProposalController proposalController,
                            ResumeController resumeController) {
        this.startView = new StartView();
        this.proposalView = new ProposalView(proposalController);
        this.resumeView = new ResumeView(resumeController);
    }

    @Override
    protected void start(){
        this.startView.show();
    }

    @Override
    protected boolean propose(){
        return this.proposalView.interact();
    }

    @Override
    protected boolean resume(){
        return this.resumeView.interact();
    }

}
