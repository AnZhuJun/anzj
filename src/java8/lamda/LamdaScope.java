package java8.lamda;

import java.util.function.Function;

public class LamdaScope {
    private LamdaScope(){
//        Function<String,String> f1 = x ->{
//            System.out.println(this);
//            return x;
//        };

        Function<String,String> f1 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println(this);
                return s;
            }
        };

        System.out.println(f1.apply("Damo"));
    }

    @Override
    public String toString() {
        return "I am Lamda Scope";
    }

    public static void main(String[] args) {
        new LamdaScope();
    }
}
