package collection.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListForEach {
    public static void main(String[] args) {
        List<String> stocks = new ArrayList<>();
        stocks.add("Google");
        stocks.add("Apple");
        stocks.add("Microsoft");
        stocks.add("Facebook");

        Consumer<Object> consumer = new ListForEach().new MyConsumer();
        stocks.forEach(consumer);

        stocks.forEach(o->System.out.println("processing: " + o));

    }

    class MyConsumer implements Consumer<Object>{

        @Override
        public void accept(Object o) {
            System.out.println("processing: " + o) ;
        }
    }
}
