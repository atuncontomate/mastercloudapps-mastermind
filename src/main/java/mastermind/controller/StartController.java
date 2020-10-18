package mastermind.controller;

import mastermind.models.Board;
import mastermind.models.State;

public class StartController extends Controller{

    public StartController(Board board, State state){
        super(board, state);
    }

    public void next() {
        this.state.next();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
