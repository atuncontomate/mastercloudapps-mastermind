package mastermind;

import mastermind.controllers.Logic;
import mastermind.controllers.impl.LogicImpl;
import mastermind.views.graphics.MainView;

public class GraphicsMastermind extends Mastermind {

    @Override
    protected Logic createLogic() {
        return new LogicImpl();
    }

    @Override
    protected mastermind.views.MainView createView() {
        return new MainView();
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
