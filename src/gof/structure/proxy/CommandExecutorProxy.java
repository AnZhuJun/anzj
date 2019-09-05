package gof.structure.proxy;

import java.util.concurrent.ExecutionException;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user,String pwd) {
        if("dharma".equals(user) && "2019".equals(pwd))
            isAdmin = true;

        executor = new CommandExecutorImpl();
    }

    @Override
    public void run(String cmd) throws Exception {
            if(isAdmin){
                executor.run(cmd);
            }
            else{
                if(cmd.trim().startsWith("rm")){
                    throw new Exception("rm command is not allowed for non-admin users");

                }else{
                    executor.run(cmd);
                }
            }
    }
}
