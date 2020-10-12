package mastermind;

public class MakerPlayer extends Player{

    private Combination secretCombination;

    public MakerPlayer(Board board) {
        super(board);
        secretCombination = Combination.random();
    }

    @Override
    public Result getResult(){
        Result result = board.getLastResult();
        Combination combination = result.getCombination();
        if(combination.isValid()){
            Success[] hits = secretCombination.getCombinationHits(result.getCombination());
            result.putHits(hits);
            board.increaseLastResult();
        }
        return result;
    }

}
