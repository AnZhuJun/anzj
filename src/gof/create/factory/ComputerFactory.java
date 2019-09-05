package gof.create.factory;

public class ComputerFactory {

    public static Computer getComputer(String type,String ram,String hdd,String cpu){

        if("PC".equalsIgnoreCase(type)){
            return new PC(ram,hdd,cpu);
        }else if("Server".equalsIgnoreCase(type)){
            return new Server(ram, hdd, cpu);
        }

        return null;
    }

    public static void main(String[] args) {
        Computer pc  = ComputerFactory.getComputer("pc","2GB","1T","i7-4700HQ");
        Computer server  = ComputerFactory.getComputer("server","100GB","500T","i7-9900K");
        System.out.println(pc);
        System.out.println(server);

    }

}
