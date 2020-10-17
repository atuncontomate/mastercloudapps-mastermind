package mastermind.views.graphics;

import mastermind.models.Board;

public class MainView extends mastermind.views.MainView {

    private StartView startView;
    private ProposalView proposalView;
    private ResumeView resumeView;

    public MainView(Board board) {
        super(board);
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.board);
        this.resumeView = new ResumeView(this.board);
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
