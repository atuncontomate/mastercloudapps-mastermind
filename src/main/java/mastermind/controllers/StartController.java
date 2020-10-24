package mastermind.controllers;

import mastermind.models.Session;

public class StartController extends Controller implements AcceptorController{

    public StartController(Session session){
        super(session);
    }

    public void next() {
        this.session.next();
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
