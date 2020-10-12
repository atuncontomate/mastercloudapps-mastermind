package mastermind;

import utils.Console;

public class Result {

    private Combination combination;
    private Success[] hits;
    private int order;

    public Result(int order){
        combination = new Combination();
        hits = new Success[Combination.COMBINATION_LENGTH];
        for(int i=0; i<Combination.COMBINATION_LENGTH; i++){
            hits[i] = Success.NULL_SUCCESS;
        }
        this.order = order;
    }

    public void putHits(Success[] hits){
        this.hits = hits;
    }

    public boolean emptyCombination(){
        return combination.isEmpty();
    }

    public Combination getCombination(){
        return combination;
    }

    public int getOrder(){
        return order;
    }

    public boolean isWinnerResult(){
        for(int i=0; i < hits.length; i++){
            if(!hits[i].equals(Success.BLACK)) return false;
        }
        return true;
    }

    public void writeNumberBlackSuccess() {
        int blackSuccess = 0;
        for(int i=0; i<Combination.COMBINATION_LENGTH; i++){
            if(Success.BLACK.equals(hits[i])) blackSuccess++;
        }
        Console.instance().write(blackSuccess);
    }

    public void writeNumberWhiteSuccess() {
        int whiteSuccess = 0;
        for(int i=0; i<Combination.COMBINATION_LENGTH; i++){
            if(Success.WHITE.equals(hits[i])) whiteSuccess++;
        }
        Console.instance().write(whiteSuccess);
    }
}
