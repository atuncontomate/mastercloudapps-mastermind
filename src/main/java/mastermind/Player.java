package mastermind;

public abstract class Player {

    protected Board board;

    public Player(Board board){
        this.board = board;
    }

    public void play(){
        board.putResult(getResult());
    }

    public abstract Result getResult();

}
