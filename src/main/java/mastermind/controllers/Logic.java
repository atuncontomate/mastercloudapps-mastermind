package mastermind.controllers;

import mastermind.models.Session;
import mastermind.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {

    protected Session session;
    protected Map<StateValue, AcceptorController> controllers;

    public Logic() {
        this.controllers = new HashMap<StateValue, AcceptorController>();
    }

    public AcceptorController getController() {
        return this.controllers.get(this.session.getValueState());
    }
}
