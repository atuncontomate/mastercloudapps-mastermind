package mastermind.controller;

import mastermind.models.Board;
import mastermind.models.State;
import mastermind.views.StartView;

public class StartController extends Controller{

    public StartController(Board board, State state){
        super(board, state);
    }

    @Override
    public void control() {
        new StartView().write();
        this.state.next();
    }
}
