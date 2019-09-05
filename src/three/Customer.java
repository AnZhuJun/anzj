package three;

public class Customer {
    public static void main(String[] args) {
        System.out.println("buy BMW");
        Car bmw = CarFactory.getCar("BMW");
        System.out.println("out: "+bmw.getInfor());

        System.out.println("buy BMW");
        Car benz = CarFactory.getCar("Benz");
        System.out.println("out: "+benz.getInfor());

    }
}
