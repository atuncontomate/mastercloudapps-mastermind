package mastermind;

import mastermind.controller.Controller;
import mastermind.controller.Logic;
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
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }
}
