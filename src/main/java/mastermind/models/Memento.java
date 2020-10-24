package mastermind.models;

public class Memento {

    private ProposedCombination[] proposedCombinations;
    private Result[] results;
    private int attempts;

    public Memento(ProposedCombination[] proposedCombinations,
                   Result[] results,
                   int attempts){
        this.proposedCombinations = proposedCombinations;
        this.results = results;
        this.attempts = attempts;
    }

    public ProposedCombination[] getProposedCombinations(){
        return this.proposedCombinations;
    }

    public Result[] getResults(){
        return this.results;
    }
    public int getAttempts(){
        return this.attempts;
    }
}
