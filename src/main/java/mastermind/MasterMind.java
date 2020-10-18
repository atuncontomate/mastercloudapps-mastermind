package mastermind;

import mastermind.controller.ProposalController;
import mastermind.controller.ResumeController;
import mastermind.models.Board;
import mastermind.views.MainView;

public abstract class MasterMind {

    private Board board;

    private MainView view;

    protected MasterMind() {
        this.board = new Board();
        this.view = this.createView(new ProposalController(board), new ResumeController(board));
    }

    protected abstract MainView createView(ProposalController proposalController, ResumeController resumeController);

    protected void play() {
        this.view.interact();
    }
}
