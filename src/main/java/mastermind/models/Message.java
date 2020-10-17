package mastermind.models;

public enum Message {
    TITLE("----- MASTERMIND -----"),
    ATTEMPTS(" attempt(s):"),
    SECRET("x"),
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
