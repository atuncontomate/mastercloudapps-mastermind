package mastermind.models;

public class Board {

    private final int MAX_ATTEMPS = 10;

    private ProposedCombination[] proposedCombinations;
    private SecretCombination secretCombination;
    private Result[] results;
    private int attempts;

    public Board() {
        this.reset();
    }

    public void reset() {
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
        return this.attempts > 0
                && (this.results[this.attempts -1].isWinnerResult() || this.attempts == MAX_ATTEMPS);
    }

    public boolean isBreakerWinner() {
        return this.results[this.attempts -1].isWinnerResult();
    }

    public ProposedCombination getAttemptProposedCombination(int attempt){
        return this.proposedCombinations[attempt];
    }

    public Result getAttemptResult(int attempt){
        return this.results[attempt];
    }

    public int getAttempts(){
        return this.attempts;
    }

    public Memento createMemento() {
        return new Memento(this.proposedCombinations, this.results, this.attempts);
    }

    public void set(Memento memento) {
        this.proposedCombinations = memento.getProposedCombinations();
        this.results = memento.getResults();
        this.attempts = memento.getAttempts();
    }
}
