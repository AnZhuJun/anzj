package generics;

public class GenericMethod {
    private static <T> boolean isEqual(GenericClass<T> g1,GenericClass<T> g2){

        return g1.getItem().equals(g2.getItem());
    }

    private static <T extends Comparable<T>> int compare(T t1,T t2){
        return t1.compareTo(t2);
    }

    public static void main(String[] args) {
        GenericClass<String> g1 = new GenericClass<>();
        g1.setItem("a");

        GenericClass<String> g2 = new GenericClass<>();
        g2.setItem("a");

        boolean isEqual = isEqual(g1,g2);

        int a = 1;
        int b = 2;
        int com = compare(a,b);

        System.out.println(com);
        System.out.println(isEqual);
    }
}
