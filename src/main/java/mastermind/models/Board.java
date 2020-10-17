package mastermind.models;

public class Board {

    private final int MAX_ATTEMPS = 10;

    private ProposedCombination[] proposedCombinations;
    private SecretCombination secretCombination;
    private Result[] results;
    private int attempts;

    public Board() {
        this.secretCombination = new SecretCombination();
        this.proposedCombinations = new ProposedCombination[MAX_ATTEMPS];
        this.results = new Result[MAX_ATTEMPS];
        this.attempts = 0;
    }

    public void add(ProposedCombination proposedCombination) {
        this.proposedCombinations[this.attempts] = proposedCombination;
        this.results[this.attempts] = this.secretCombination.getResult(proposedCombination);
        this.attempts++;
    }

    public boolean isEndedGame() {
        return attempts > 0
                && (results[attempts -1].isWinnerResult() || attempts == MAX_ATTEMPS);
    }

    public boolean isBreakerWinner() {
        return results[attempts -1].isWinnerResult();
    }

    public ProposedCombination getAttemptProposedCombination(int attempt){
        return proposedCombinations[attempt];
    }

    public Result getAttemptResult(int attempt){
        return results[attempt];
    }

    public int getAttempts(){
        return attempts;
    }
}
