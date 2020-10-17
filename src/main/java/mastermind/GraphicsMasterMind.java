package mastermind;

import mastermind.models.Board;
import mastermind.views.MainView;
import mastermind.views.graphics.GraphicsMainView;

public class GraphicsMasterMind extends MasterMind{

    @Override
    protected MainView createView(Board game) {
        return new GraphicsMainView(game);
    }

    public static void main(String[] args) {
        new GraphicsMasterMind().play();
    }

}
