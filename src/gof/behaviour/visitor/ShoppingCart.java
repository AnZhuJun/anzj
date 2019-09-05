package gof.behaviour.visitor;

public class ShoppingCart implements Visitor{

    @Override
    public int visit(Book book) {
        int cost = book.getPrice();
//        if(book.getPrice() > 50){
//            cost = book.getPrice()-5;
//        }else{
//            cost = book.getPrice();
//        }
        cost  = cost >50?cost - 5 : cost;

        System.out.println( "Book " + book.getName() + " cost::" + cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPrice() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost:: " + cost);
        return cost;
    }
}
