package mastermind;

public class Turn {

    private static final int NUMBER_PLAYERS = 2;
    private Player[] players;
    private int activePlayer;

    public Turn(Board board) {
        assert board != null;
        Message.TITTLE.writeln();

        this.players = new Player[Turn.NUMBER_PLAYERS];
        players[0] = new BreakerPlayer(board);
        players[1] = new MakerPlayer(board);

        this.activePlayer = Turn.NUMBER_PLAYERS-1;
    }

    public void play(){
        this.activePlayer = (this.activePlayer+1) % Turn.NUMBER_PLAYERS;
        getActivePlayer().play();
    }

    public Player getActivePlayer() {
        return players[activePlayer];
    }


}
