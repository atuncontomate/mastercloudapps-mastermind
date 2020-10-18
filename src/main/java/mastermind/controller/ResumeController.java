package mastermind.controller;

import mastermind.models.Board;
import mastermind.models.State;

public class ResumeController extends Controller{

    public ResumeController(Board board, State state){
        super(board, state);
    }

    public void clear() {
        this.board.clear();
        this.state.reset();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
