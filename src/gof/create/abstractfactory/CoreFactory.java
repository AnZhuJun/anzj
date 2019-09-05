package gof.create.abstractfactory;

public class CoreFactory extends AbstractFactory{
    @Override
    public CPU createCPU() {
        return new CoreCPU();
    }

    @Override
    public MMU createMMU() {
        return new CoreMMU();
    }
}
