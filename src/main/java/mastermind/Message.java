package mastermind;

import utils.Console;

enum Message {
    TITTLE("----- MASTERMIND -----"),
    ATTEMPTS(" attempt(s):"),
    POSITIONS_SAMPLE("xxxx"),
    COMBINATION_HITS_SEPARATOR(" --> "),
    BLACKS_AND(" blacks and "),
    WHITES(" whites"),
    BREAKER_WON("You've won!!! ;-)"),
    BREAKER_LOST("You've lost!!! :-("),
    RESUME("RESUME? "),
    NULL_MESSAGE();

    private String message;

    Message() {

    }

    Message(String message) {
        this.message = message;
    }

    void write() {
        Console.instance().write(this.message);
    }

    void writeln() {
        Console.instance().writeln(this.message);
    }

    @Override
    public String toString() {
        return this.message;
    }

}
