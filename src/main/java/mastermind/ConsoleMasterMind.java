package mastermind;

import mastermind.views.MainView;
import mastermind.views.console.ConsoleMainView;

public class ConsoleMasterMind extends MasterMind{

    @Override
    protected MainView createView() {
        return new ConsoleMainView();
    }

    public static void main(String[] args) {
        new ConsoleMasterMind().play();
    }

}
