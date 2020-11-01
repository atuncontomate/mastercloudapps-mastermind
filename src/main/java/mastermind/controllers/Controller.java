package mastermind.controllers;

import mastermind.models.Session;
import mastermind.types.StateValue;

public abstract class Controller {

    protected Session session;

    public Controller(Session session){
        this.session = session;
    }

    public StateValue getValueState() {
        return this.session.getValueState();
    }

}
