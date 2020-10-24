package mastermind;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.Logic;
import mastermind.views.MainView;

public abstract class MasterMind {

    private Logic logic;

    private MainView view;

    protected MasterMind() {
        this.logic = new Logic();
        this.view = this.createView();
    }

    protected abstract MainView createView();

    protected void play() {
        AcceptorController controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }
}
