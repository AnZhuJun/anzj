package generics;

public class Triple<T extends Number & Comparable<T>> {
    private T value1;
    private T value2;
    private T value3;

    public Triple(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    public T getValue3() {
        return value3;
    }

    public void setValue3(T value3) {
        this.value3 = value3;
    }

    public T addValues(){
        Number v = value1.intValue() + value2.intValue() + value3.intValue();
        return (T)v;
    }

    public T largest(){
        T max = value1;

        if(value2.compareTo(max)>0)
            max = value2;
        if(value3.compareTo(max)>0)
            max = value3;
        return max;
    }

    public static void main(String[] args) {
        Triple<Integer> t = new Triple<>(3,6,5);

        Integer sum = t.addValues();
        System.out.println(sum);

        System.out.println(t.largest());
        t.setValue3(55);
        System.out.println(t.largest());
    }
}