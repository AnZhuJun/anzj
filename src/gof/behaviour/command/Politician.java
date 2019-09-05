package gof.behaviour.command;

public class Politician implements Command {
    @Override
    public void execute() {
        System.out.println("take money from the rich, take votes from the poor");
    }
}
