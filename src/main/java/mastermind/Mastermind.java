package mastermind;

import mastermind.controller.*;
import mastermind.models.Board;
import mastermind.models.State;
import mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Mastermind {

    private State state;
    private Map<StateValue, Controller> controllers;

    public Mastermind() {
        Board board = new Board();
        this.state = new State();
        this.controllers = new HashMap<StateValue, Controller>();
        this.controllers.put(StateValue.START, new StartController(board, this.state));
        this.controllers.put(StateValue.PROPOSE, new ProposalController(board, this.state));
        this.controllers.put(StateValue.RESUME, new ResumeController(board, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    void play() {
        Controller controller;
        do {
            controller = this.controllers.get(this.state.getValueState());
            if (controller != null) {
                controller.control();
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }
}
