package generics;

public class GenericClass<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        GenericClass<String> type = new GenericClass<>();
        type.setItem("a");
        System.out.println(type.getItem());

        GenericClass<Boolean> b = new GenericClass<>();
        b.setItem(true);
        System.out.println(b.getItem());

    }
}
