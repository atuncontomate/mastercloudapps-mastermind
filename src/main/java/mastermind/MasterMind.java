package mastermind;

import mastermind.models.Board;
import mastermind.models.Message;
import mastermind.models.ProposedCombination;
import mastermind.views.BoardView;
import mastermind.views.MessageView;
import mastermind.views.ProposedCombinationView;
import utils.YesNoDialog;

public class MasterMind {

    private Board board;

    private BoardView boardView;

    private void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
    }

    private void playGame() {
        new MessageView(Message.TITTLE).writeln();
        this.board = new Board();
        this.boardView = new BoardView(board);
        boardView.write();

        do {
            ProposedCombination proposedCombination = new ProposedCombination();
            new ProposedCombinationView(proposedCombination).read();
            this.board.add(proposedCombination);
            this.boardView.write();
        } while (!this.board.isEndedGame());
        this.boardView.writeWinner();
    }

    private boolean isResumedGame() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }

}
