package mastermind;

import utils.Console;

public class Board {

    private final int NUMBER_RESULTS;

    private Result[] results;

    private int lastResult;

    public Board(int numResults) {
        NUMBER_RESULTS = numResults;
        results = new Result[NUMBER_RESULTS];
        for(int i=0; i<NUMBER_RESULTS; i++){
            results[i] = new Result(i);
        }
        lastResult = 0;
    }

    public void putResult(Result result) {
        results[result.getOrder()] = result;
    }

    public Result getLastResult() {
        if(lastResult >= NUMBER_RESULTS){
            return results[NUMBER_RESULTS-1];
        } else {
            return results[lastResult];
        }
    }

    public boolean isEndedGame() {
        return lastResult > 0
                && (results[lastResult-1].isWinnerResult() || lastResult == NUMBER_RESULTS);
    }

    public boolean isBreakerWinner() {
        return results[lastResult-1].isWinnerResult();
    }

    public void increaseLastResult(){
        lastResult++;
    }

    public void write(){
        if(getLastResult().emptyCombination()){
            Console.instance().write(getLastResult().getOrder());
            Message.ATTEMPTS.writeln();
            Message.POSITIONS_SAMPLE.writeln();

            for(int i=0; i<lastResult; i++){
                Result result = results[i];

                result.getCombination().write();
                Message.COMBINATION_HITS_SEPARATOR.write();
                result.writeNumberBlackSuccess();
                Message.BLACKS_AND.write();
                result.writeNumberWhiteSuccess();
                Message.WHITES.writeln();

            }
        }
    }

    public void writeWinner(){
        if(isBreakerWinner()){
            Message.BREAKER_WON.writeln();
        } else {
            Message.BREAKER_LOST.writeln();
        }
    }

}
