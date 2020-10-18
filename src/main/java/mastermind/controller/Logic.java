package mastermind.controller;

import mastermind.models.Board;
import mastermind.models.State;
import mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    private State state;
    private Map<StateValue, Controller> controllers;

    public Logic() {
        Board board = new Board();
        this.state = new State();
        this.controllers = new HashMap<StateValue, Controller>();
        this.controllers.put(StateValue.START, new StartController(board, this.state));
        this.controllers.put(StateValue.PROPOSE, new ProposalController(board, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(board, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }
}
