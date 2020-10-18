package mastermind;

import mastermind.views.MainView;
import mastermind.views.graphics.GraphicsMainView;

public class GraphicsMasterMind extends MasterMind{

    @Override
    protected MainView createView() {
        return new GraphicsMainView();
    }

    public static void main(String[] args) {
        new GraphicsMasterMind().play();
    }

}
