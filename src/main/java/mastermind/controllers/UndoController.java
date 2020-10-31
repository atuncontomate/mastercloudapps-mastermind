package mastermind.controllers;

import mastermind.models.Session;
import mastermind.models.impl.SessionImpl;

public class UndoController extends Controller{

    private SessionImpl session;

    public UndoController(Session session){
        super(session);
        this.session = (SessionImpl) session;
    }

    public void undo() {
        this.session.undo();
    }

    public boolean undoable() {
        return this.session.undoable();
    }
}
