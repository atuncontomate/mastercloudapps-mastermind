package mastermind.models;

public class Result {

    private int blacks;
    private int whites;

    public Result(int blacks, int whites){
        this.blacks = blacks;
        this.whites = whites;
    }

    public boolean isWinnerResult(){
        return blacks == Combination.COMBINATION_LENGTH;
    }

    public int getBlacks(){
        return blacks;
    }

    public int getWhites(){
        return whites;
    }
}
