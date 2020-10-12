package mastermind;

public class BreakerPlayer extends Player{

    public BreakerPlayer(Board board) {
        super(board);
    }

    @Override
    public Result getResult(){
        Result lastResult = board.getLastResult();
        lastResult.getCombination().read();
        return lastResult;
    }
}
