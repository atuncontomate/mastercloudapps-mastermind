package mastermind.distributed.dispatchers;

import mastermind.controllers.ProposalController;
import mastermind.models.Color;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;
import mastermind.models.Session;

public class ProposalControllerProxy extends ProposalController {

    private TCPIP tcpip;

    public ProposalControllerProxy(Session session, TCPIP tcpip) {
        super(session);
        this.tcpip = tcpip;
    }

    @Override
    public void add(ProposedCombination proposedCombination) {
        this.tcpip.send(FrameType.ADD.name());
        for(Color color: proposedCombination.getColors()){
            this.tcpip.send(color);
        }
    }

    @Override
    public boolean isEndedGame() {
        this.tcpip.send(FrameType.ENDED_GAME.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public int getAttempts() {
        this.tcpip.send(FrameType.ATTEMPTS.name());
        return this.tcpip.receiveInt();
    }

    @Override
    public boolean isBreakerWinner() {
        this.tcpip.send(FrameType.BREAKER_WINNER.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public ProposedCombination getAttemptProposedCombination(int attempt) {
        this.tcpip.send(FrameType.ATTEMPT_PROPOSED_COMBINATION.name());
        this.tcpip.send(attempt);

        ProposedCombination proposedCombination = new ProposedCombination();
        for(int i=0; i<ProposedCombination.COMBINATION_LENGTH; i++){
            proposedCombination.add(this.tcpip.receiveColor());
        }
        return proposedCombination;
    }

    @Override
    public Result getAttemptResult(int attempt) {

        this.tcpip.send(FrameType.ATTEMPT_RESULT.name());
        this.tcpip.send(attempt);

        int blacks = this.tcpip.receiveInt();
        int whites = this.tcpip.receiveInt();

        return new Result(blacks, whites);
    }

    @Override
    public void undo() {
        this.tcpip.send(FrameType.UNDO.name());
    }

    @Override
    public boolean undoable() {
        this.tcpip.send(FrameType.UNDOABLE.name());
        return this.tcpip.receiveBoolean();
    }

    @Override
    public void redo() {
        this.tcpip.send(FrameType.REDO.name());
    }

    @Override
    public boolean redoable() {
        this.tcpip.send(FrameType.REDOABLE.name());
        return this.tcpip.receiveBoolean();
    }
}
