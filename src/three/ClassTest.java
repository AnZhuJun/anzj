package three;

import java.util.Date;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("first: Object.getClass()");
        Class c1 = new Date().getClass();
        System.out.println(c1.getName());

        System.out.println("secound: .class");
        Class c2 = boolean.class;
        System.out.println(c2.getName());

        System.out.println("third: Class.forName()");
        Class c3 = Class.forName("java.lang.String");
        System.out.println(c3.getName());

        System.out.println("fourth: type");
        Class c4 = Double.TYPE;
        System.out.println(c4.getName());
    }
}