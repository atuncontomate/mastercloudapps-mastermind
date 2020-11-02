package mastermind.controller;

import mastermind.models.Board;
import mastermind.models.State;

public abstract class Controller {

    protected Board board;

    protected State state;

    public Controller(Board board, State state){
        this.board = board;
        this.state = state;
    }

    public abstract void control();
}
