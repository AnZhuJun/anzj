package gof.behaviour.visitor;

public class Client {
    public static void main(String[] args) {
        Element[] items = new Element[]{
                new Book(20,"abcd1234"),
                new Book(100,"asdad"),
                new Fruit(12,2,"apple"),
                new Fruit(30,4,"banana")
        };

        int total = calculatePrice(items);
        System.out.println("Total price = " + total);
    }

    private static int calculatePrice(Element[] elements) {
        Visitor cart = new ShoppingCart();
        int sum = 0;

        for(Element element : elements){
            sum += element.accept(cart);
        }

        return sum;
    }
}
