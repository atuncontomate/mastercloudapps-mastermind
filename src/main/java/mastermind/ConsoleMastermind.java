package mastermind;

import mastermind.views.console.MainView;

public abstract class ConsoleMastermind extends Mastermind {

    @Override
    protected mastermind.views.MainView createView() {
        return new MainView();
    }

}
