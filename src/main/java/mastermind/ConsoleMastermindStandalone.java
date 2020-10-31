package mastermind;

import mastermind.controllers.Logic;
import mastermind.controllers.impl.LogicImpl;

public class ConsoleMastermindStandalone extends ConsoleMastermind {

    @Override
    protected Logic createLogic() {
        return new LogicImpl();
    }

    public static void main(String[] args) {
        new ConsoleMastermindStandalone().play();
    }

}
