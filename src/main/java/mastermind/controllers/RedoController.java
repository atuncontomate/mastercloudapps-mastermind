package mastermind.controllers;

import mastermind.models.Session;
import mastermind.models.impl.SessionImpl;

public class RedoController extends Controller{

    private SessionImpl session;

    public RedoController(Session session){
        super(session);
        this.session = (SessionImpl) session;
    }

    public void redo() {
        this.session.redo();
    }

    public boolean redoable() {
        return this.session.redoable();
    }
}
