package mastermind.views;

import mastermind.models.Board;
import mastermind.types.Message;
import utils.Console;

public class BoardView {

    private Board board;

    public BoardView(Board board){
        this.board = board;
    }

    public void write() {
        Console.instance().writeln();
        Console.instance().write(board.getAttempts());
        Message.ATTEMPTS.writeln();
        new SecretCombinationView().writeln();

        for(int i = 0; i< this.board.getAttempts(); i++){
            new ProposedCombinationView(this.board.getAttemptProposedCombination(i)).write();
            new ResultView(this.board.getAttemptResult(i)).writeln();
        }
    }

    public void writeWinner() {
        if(this.board.isBreakerWinner()){
            Message.BREAKER_WON.writeln();
        } else {
            Message.BREAKER_LOST.writeln();
        }
    }
}
