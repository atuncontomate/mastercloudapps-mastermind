package mastermind.controllers.impl;

import mastermind.controllers.ControllerVisitor;
import mastermind.controllers.ResumeController;
import mastermind.models.Session;
import mastermind.models.impl.SessionImpl;

public class ResumeControllerImpl extends ResumeController {

    private SessionImpl session;

    public ResumeControllerImpl(Session session){
        super(session);
        this.session = (SessionImpl) session;
    }

    public void resume(boolean isResumed){
        if (isResumed) {
            this.session.reset();
        } else {
            this.session.next();
        }
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
