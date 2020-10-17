package mastermind;

import mastermind.models.Board;
import mastermind.views.MainView;
import mastermind.views.console.ConsoleMainView;

public class ConsoleMasterMind extends MasterMind{

    @Override
    protected MainView createView(Board game) {
        return new ConsoleMainView(game);
    }

    public static void main(String[] args) {
        new ConsoleMasterMind().play();
    }

}
