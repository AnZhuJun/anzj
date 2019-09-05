package java8.fi;

interface InterfaceA{
    void dosomething();
}

interface InterfaceB{
    void dosomething();
}

interface InterfaceC extends InterfaceA,InterfaceB{
    void dosomething();
}

public class DiamondInterface implements InterfaceA,InterfaceB,InterfaceC{

    @Override
    public void dosomething() {
        System.out.println("do something");
    }

    public static void main(String[] args) {
        InterfaceA objA = new DiamondInterface();
        InterfaceB objB = new DiamondInterface();
        InterfaceC objC = new DiamondInterface();

        objA.dosomething();
        objB.dosomething();
        objC.dosomething();
    }
}
