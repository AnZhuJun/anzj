package java8.stream;

import java.util.stream.Stream;

public class CreateBuilder {
    public static void main(String[] args) {
        Stream<String> stream  = Stream.<String>builder().add("Web").add("Java").add("Spring").add("Cloud").add("Docker").build();

        stream.forEach(System.out::println);

        String str = "5 2 88 12 abc,12, 9,1 25";
        str.chars().filter(n -> !Character.isDigit(n) || !Character.isWhitespace(n)).forEach(n->System.out.println((char)n));

//        System.out.println(Character.isDigit());
    }
}
