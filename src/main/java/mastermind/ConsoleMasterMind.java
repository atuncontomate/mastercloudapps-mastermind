package mastermind;

import mastermind.views.console.MainView;

public class ConsoleMasterMind extends MasterMind{

    @Override
    protected mastermind.views.MainView createView() {
        return new MainView();
    }

    public static void main(String[] args) {
        new ConsoleMasterMind().play();
    }

}
