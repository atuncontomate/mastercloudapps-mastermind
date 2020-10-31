package mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class BoardRegistry {

    private List<Memento> mementoList;
    private Board board;

    private int firstPrevious;

    public BoardRegistry(Board board) {
        this.board = board;
        this.reset();
    }

    public void reset() {
        this.mementoList = new ArrayList<Memento>();
        this.firstPrevious = 0;
    }

    public void registry() {
        for (int i = 0; i < this.firstPrevious; i++) {
            this.mementoList.remove(0);
        }
        this.firstPrevious = 0;
        this.mementoList.add(this.firstPrevious, this.board.createMemento());
    }

    public void undo() {
        this.firstPrevious++;
        this.board.set(this.mementoList.get(this.firstPrevious));
    }

    public void redo() {
        this.firstPrevious--;
        this.board.set(this.mementoList.get(this.firstPrevious));
    }

    public boolean undoable() {
        return this.firstPrevious < this.mementoList.size() - 1;
    }

    public boolean redoable() {
        return this.firstPrevious >= 1;
    }

}
