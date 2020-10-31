package mastermind.views.console;

import mastermind.controllers.ProposalController;
import mastermind.views.Message;
import utils.Console;

public class BoardView {

    public void write(ProposalController proposalController){
        Console.instance().writeln();
        Console.instance().write(proposalController.getAttempts());
        Message.ATTEMPTS.writeln();
        new SecretCombinationView().writeln();

        for(int i = 0; i< proposalController.getAttempts(); i++){
            new ProposedCombinationView(proposalController.getAttemptProposedCombination(i)).write();
            new ResultView(proposalController.getAttemptResult(i)).writeln();
        }
    }

    public void writeWinner(ProposalController proposalController){
        if(proposalController.isBreakerWinner()){
            Message.BREAKER_WON.writeln();
        } else {
            Message.BREAKER_LOST.writeln();
        }
    }
}
