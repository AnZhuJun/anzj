package gof.create.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory coreFactory = AbstractFactory.getFactory(Architecture.CORE);
        CPU cpu = coreFactory.createCPU();
        System.out.println(cpu);

        AbstractFactory xeonFactory = AbstractFactory.getFactory(Architecture.XEON);
        cpu = xeonFactory.createCPU();
        System.out.println(cpu);
    }
}
