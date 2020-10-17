package mastermind.views;

import mastermind.models.Board;

public class MainView {

    protected Board board;

    private StartView startView;

    private ProposalView proposalView;

    private ResumeView resumeView;

    public MainView(Board board) {
        this.board = board;
        this.startView = new StartView();
        this.proposalView = new ProposalView(this.board);
        this.resumeView = new ResumeView(this.board);
    }

    public void interact() {
        boolean newGame;
        do {
            this.startView.interact();
            boolean finished;
            do {
                finished = this.proposalView.interact();
            } while (!finished);
            newGame = this.resumeView.interact();
        } while (newGame);
    }
}
