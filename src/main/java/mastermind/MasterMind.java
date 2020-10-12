package mastermind;

import utils.YesNoDialog;

public class MasterMind {

    private Board board;
    private Turn turn;

    private void play() {
        do {
            this.playGame();
        } while (this.isResumedGame());
    }

    private void playGame() {
        this.board = new Board(10);
        this.turn = new Turn(this.board);
        this.board.write();
        do {
            this.turn.play();
            this.board.write();
        } while (!this.board.isEndedGame());
        this.board.writeWinner();
    }

    private boolean isResumedGame() {
        return new YesNoDialog().read(Message.RESUME.toString());
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }

}
