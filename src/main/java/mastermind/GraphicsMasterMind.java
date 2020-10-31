package mastermind;

import mastermind.views.graphics.MainView;

public class GraphicsMasterMind extends MasterMind{

    @Override
    protected mastermind.views.MainView createView() {
        return new MainView();
    }

    public static void main(String[] args) {
        new GraphicsMasterMind().play();
    }

}
