package mastermind.views.console;

import mastermind.models.Board;

public class ConsoleMainView extends mastermind.views.MainView {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public ConsoleMainView(Board board) {
        super(board);
        this.startView = new StartView();
        this.proposalView = new ProposalView(board);
        this.resumeView = new ResumeView(board);
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
