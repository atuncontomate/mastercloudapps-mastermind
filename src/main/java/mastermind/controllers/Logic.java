package mastermind.controllers;

import mastermind.models.Session;
import mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    private Session session;
    private Map<StateValue, AcceptorController> controllers;

    public Logic() {
        this.session = new Session();
        this.controllers = new HashMap<StateValue, AcceptorController>();
        this.controllers.put(StateValue.START, new StartController(this.session));
        this.controllers.put(StateValue.PROPOSE, new ProposalController(this.session));
        this.controllers.put(StateValue.RESUME, new ResumeController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

    public AcceptorController getController() {
        return this.controllers.get(this.session.getValueState());
    }
}
