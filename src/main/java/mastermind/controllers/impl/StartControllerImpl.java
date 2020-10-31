package mastermind.controllers.impl;

import mastermind.controllers.StartController;
import mastermind.models.Session;
import mastermind.models.impl.SessionImpl;

public class StartControllerImpl extends StartController {

    private SessionImpl session;

    public StartControllerImpl(Session session){
        super(session);
        this.session = (SessionImpl) session;
    }

    @Override
    public void start() {
        this.session.next();
    }
}
