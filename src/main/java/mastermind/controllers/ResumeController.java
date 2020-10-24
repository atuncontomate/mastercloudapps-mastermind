package mastermind.controllers;

import mastermind.models.Session;

public class ResumeController extends Controller implements AcceptorController{

    public ResumeController(Session session){
        super(session);
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
