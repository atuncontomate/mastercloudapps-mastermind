package mastermind.views.console;

import mastermind.controller.ProposalController;
import mastermind.models.Message;
import utils.WithConsoleView;

public class BoardView extends WithConsoleView {

    private ProposalController proposalController;

    public BoardView(ProposalController proposalController){
        this.proposalController = proposalController;
    }

    public void write(){
        this.console.writeln();
        this.console.write(proposalController.getAttempts());
        new MessageView(Message.ATTEMPTS).writeln();
        new SecretCombinationView().writeln();

        for(int i = 0; i< proposalController.getAttempts(); i++){
            new ProposedCombinationView(proposalController.getAttemptProposedCombination(i)).write();
            new ResultView(proposalController.getAttemptResult(i)).writeln();
        }
    }

    public void writeWinner(){
        if(proposalController.isBreakerWinner()){
            new MessageView(Message.BREAKER_WON).writeln();
        } else {
            new MessageView(Message.BREAKER_LOST).writeln();
        }
    }
}
