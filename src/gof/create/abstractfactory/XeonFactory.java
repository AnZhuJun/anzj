package gof.create.abstractfactory;

public class XeonFactory extends AbstractFactory{

    @Override
    public CPU createCPU() {
        return new XeonW();
    }

    @Override
    public MMU createMMU() {
        return new XeonMMU();
    }
}
