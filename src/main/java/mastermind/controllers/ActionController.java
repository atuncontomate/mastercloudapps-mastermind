package mastermind.controllers;

import mastermind.models.ProposedCombination;
import mastermind.models.Result;
import mastermind.models.Session;

public class ActionController extends Controller{

    public ActionController(Session session){
        super(session);
    }

    public void add(ProposedCombination proposedCombination) {
        this.session.add(proposedCombination);
    }

    public boolean isEndedGame() {
        boolean isEndedGame = this.session.isEndedGame();
        if(isEndedGame){
            this.session.next();
        }
        return isEndedGame;
    }

    public int getAttempts() {
        return this.session.getAttempts();
    }

    public boolean isBreakerWinner() {
        return this.session.isBreakerWinner();
    }

    public ProposedCombination getAttemptProposedCombination(int attempt){
        return this.session.getAttemptProposedCombination(attempt);
    }

    public Result getAttemptResult(int attempt){
        return this.session.getAttemptResult(attempt);
    }
}
