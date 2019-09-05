package collection.grocery;

public class Entry {
    private static Grocery grocery = new Grocery();

    public static void main(String[] args) {
        grocery.addItem("huawei p30");
        grocery.addItem("desk");
        grocery.addItem("pineapple");
        grocery.addItem("cherry");
        grocery.addItem("strawberry");
        grocery.addItem("pen");
        grocery.addItem("iPhone");
        grocery.addItem("bean");

        System.out.println("Total number of " + grocery.total());
        System.out.println("Item are " + grocery.toString());

        grocery.delItemByPos(4);
        grocery.delItemByValue("bean");

        grocery.modifyItem(0,"huawei p30 pro");

        String pen = grocery.findItem("pen");
        System.out.println(pen);

        System.out.println("Total number of " + grocery.total());
        System.out.println("Item are " + grocery.toString());
    }
}
