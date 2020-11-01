package mastermind.distributed.dispatchers;

public enum FrameType {
    START,
    STATE,
    UNDO,
    REDO,
    UNDOABLE,
    REDOABLE,
    CLOSE,
    ADD,
    ATTEMPT_RESULT,
    ATTEMPTS,
    ATTEMPT_PROPOSED_COMBINATION,
    BREAKER_WINNER,
    ENDED_GAME,
    RESUME;

    public static FrameType parser(String string) {
        for(FrameType frameType : FrameType.values()) {
            if (frameType.name().equals(string)) {
                return frameType;
            }
        }
        return null;
    }
}
