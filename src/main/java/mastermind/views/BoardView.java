package mastermind.views;

import mastermind.models.Board;
import mastermind.models.Message;
import utils.Console;

public class BoardView {

    private Board board;

    public BoardView(Board board){
        this.board = board;
    }

    public void write(){
        Console.instance().writeln();
        Console.instance().write(board.getAttempts());
        new MessageView(Message.ATTEMPTS).writeln();
        new MessageView(Message.POSITIONS_SAMPLE).writeln();

        for(int i = 0; i< board.getAttempts(); i++){
            new ProposedCombinationView(board.getAttemptProposedCombination(i)).write();
            new ResultView(board.getAttemptResult(i)).writeln();
        }
    }

    public void writeWinner(){
        if(board.isBreakerWinner()){
            new MessageView(Message.BREAKER_WON).writeln();
        } else {
            new MessageView(Message.BREAKER_LOST).writeln();
        }
    }
}
