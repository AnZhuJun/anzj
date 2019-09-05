package gof.structure.proxy;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void run(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
