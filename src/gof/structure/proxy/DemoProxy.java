package gof.structure.proxy;

public class DemoProxy {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("dharma","2018");
        try{
            executor.run("ls -ltr");
            executor.run("rm -rf lala.txt");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
