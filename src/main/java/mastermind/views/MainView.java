package mastermind.views;

import mastermind.models.Board;

public abstract class MainView {
    protected Board board;

    public MainView(Board board) {
        this.board = board;
    }

    public void interact() {
        do {
            this.start();
            boolean finished;
            do {
                finished = this.propose();
            } while (!finished);
        } while (this.resume());
    }

    protected abstract void start();
    protected abstract boolean propose();
    protected abstract boolean resume();
}
