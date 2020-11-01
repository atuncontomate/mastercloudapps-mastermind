package mastermind.distributed;

import mastermind.controllers.impl.LogicImpl;
import mastermind.distributed.dispatchers.*;
import mastermind.distributed.dispatchers.action.*;
import mastermind.distributed.dispatchers.redo.RedoDispatcher;
import mastermind.distributed.dispatchers.redo.RedoableDispatcher;
import mastermind.distributed.dispatchers.undo.UndoDispatcher;
import mastermind.distributed.dispatchers.undo.UndoableDispatcher;
import mastermind.types.StateValue;

public class LogicImplServer extends LogicImpl {

    public void createDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.controllers.get(StateValue.START)));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.ADD, new AddDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.ATTEMPT_RESULT, new AttemptResultDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.ATTEMPTS, new AttemptsDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.ATTEMPT_PROPOSED_COMBINATION, new AttemptProposedCombinationDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.BREAKER_WINNER, new BreakerWinnerDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.ENDED_GAME, new EndedGameDispatcher(this.controllers.get(StateValue.PROPOSE)));
        dispatcherPrototype.add(FrameType.RESUME, new ResumeDispatcher(this.controllers.get(StateValue.RESUME)));
    }
}
