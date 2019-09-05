package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class BasicList {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<>();

        vowels.add("A");
        vowels.add("I");
        vowels.add(1,"Z");
        System.out.println(vowels);

        List<String> vowels2 = new ArrayList<>();
        vowels2.add("S");
        vowels2.add("v");
        vowels2.addAll(vowels);
        System.out.println(vowels2);


        vowels2.clear();
        System.out.println(vowels2);

        vowels.set(1,"P");
        System.out.println(vowels);

        vowels2 = vowels.subList(0,2);
        System.out.println(vowels2);
    }
}
