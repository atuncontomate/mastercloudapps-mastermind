package mastermind.models;

public enum Message {
    TITTLE("----- MASTERMIND -----"),
    ATTEMPTS(" attempt(s):"),
    POSITIONS_SAMPLE("xxxx"),
    RESULT(" --> #blacks blacks and #whites whites"),
    BREAKER_WON("You've won!!! ;-)"),
    BREAKER_LOST("You've lost!!! :-("),
    RESUME("RESUME? "),
    PROPOSE_COMBINATION("Propose a combination: ");

    private String content;

    Message(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }
}
