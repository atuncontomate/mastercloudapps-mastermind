package mastermind.views.console;

import mastermind.controller.ProposalController;
import mastermind.controller.ResumeController;
import mastermind.views.MainView;

public class ConsoleMainView extends MainView {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public ConsoleMainView(ProposalController proposalController,
                           ResumeController resumeController) {
        this.startView = new StartView();
        this.proposalView = new ProposalView(proposalController);
        this.resumeView = new ResumeView(resumeController);
    }

    @Override
    protected void start(){
        this.startView.interact();
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
