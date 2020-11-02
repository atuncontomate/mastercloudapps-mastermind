package mastermind.controller;

import mastermind.models.Board;
import mastermind.models.State;
import mastermind.views.ResumeView;

public class ResumeController extends Controller{

    public ResumeController(Board board, State state){
        super(board, state);
    }

    @Override
    public void control() {
        if (new ResumeView().read()){
            this.board.clear();
            this.state.reset();
        } else {
            this.state.next();
        }
    }
}
