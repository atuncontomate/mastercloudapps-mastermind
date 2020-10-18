package mastermind.controller;

public interface ControllerVisitor {
    void visit(StartController startController);
    void visit(ProposalController proposalController);
    void visit(ResumeController resumeController);
}
