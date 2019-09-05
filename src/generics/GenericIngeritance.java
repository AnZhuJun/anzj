package generics;

public interface GenericIngeritance {
    public static void main(String[] args) {
        String str = "abc";
        Object obj;
        obj = str;
        System.out.println(obj);

        MyClass<String> myClass1 = new MyClass<>();
        MyClass<String> myClass2 = new MyClass<>();

        obj = myClass1;
        System.out.println(obj);

    }

    public static class MyClass<T>{

    }
}
