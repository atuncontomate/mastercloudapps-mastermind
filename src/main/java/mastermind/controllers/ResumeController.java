package mastermind.controllers;

import mastermind.models.Session;

public abstract class ResumeController extends Controller implements AcceptorController{

    public ResumeController(Session session){
        super(session);
    }

    public abstract void resume(boolean isResumed);

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
