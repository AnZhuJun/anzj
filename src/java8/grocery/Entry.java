package java8.grocery;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Entry {
    private static List<Grocery> register(){
        Grocery g1 = new Grocery(1L,"mi", Grocery.Type.phone,1999);
        Grocery g2 = new Grocery(2L,"huawei", Grocery.Type.phone,2333);
        Grocery g3 = new Grocery(3L,"windows", Grocery.Type.computer,5555);
        Grocery g4 = new Grocery(4L,"mac", Grocery.Type.computer,6666);
        Grocery g5 = new Grocery(5L,"thinkpad", Grocery.Type.computer,1999);
        Grocery g6 = new Grocery(6L,"apple", Grocery.Type.food,12);
        Grocery g7 = new Grocery(7L,"banana", Grocery.Type.food,6);
        Grocery g8 = new Grocery(8L,"beef", Grocery.Type.food,41);
        Grocery g9 = new Grocery(9L,"chicken", Grocery.Type.food,10);
        Grocery g10 = new Grocery(10L,"cucumber", Grocery.Type.food,4);

        return Arrays.asList(g1,g2,g3,g4,g5,g6,g7,g8,g9,g10);
    }

    private static void log(String prefix,Object content){
        System.out.println(prefix + content);
    }

    public static void main(String[] args) {
        List<Grocery> groceries = register();

        totalItems(groceries);

        groceryTypeItems(groceries);

        maxPrice(groceries);

        foodAvg(groceries);

        computerAvg(groceries);

        phoneAvg(groceries);

        ItemPrice(groceries);

        showAllItems(groceries.toString());

    }

    public static void showAllItems(String s) {
        System.out.println(s);
    }

    public static void ItemPrice(List<Grocery> groceries) {
        Map<String,Double> itemsMap = groceries.stream().collect(Collectors.toMap(Grocery::getName,Grocery::getPrice));
        log("Items with price: ",itemsMap);
    }

    public static void totalItems(List<Grocery> groceries) {
        long itemsCount = groceries.stream().mapToLong(s->1L).sum();
        log("total items: ",itemsCount);
    }

    public static void groceryTypeItems(List<Grocery> groceries) {
        Map<Grocery.Type,Long> groupCountByType = groceries.stream().collect(Collectors.groupingBy(Grocery::getType,Collectors.counting()));
        log("Grocery total by type is: " ,groupCountByType);
    }

    public static void maxPrice(List<Grocery> groceries) {
        Optional<Grocery> maxPrice = groceries.stream().max(Comparator.comparingDouble(Grocery::getPrice));
        if (maxPrice.isPresent()){
            log("Max price is : " ,maxPrice.get().getName());
        }
    }

    public static void foodAvg(List<Grocery> groceries) {
        double foodPriceAvg = groceries.stream().filter(Grocery::isFood).collect(Collectors.averagingDouble(Grocery::getPrice));
        log("Averange price ",foodPriceAvg);
    }

    public static void computerAvg(List<Grocery> groceries) {
        double computePriceAvg = groceries.stream().filter(Grocery::isComputer).collect(Collectors.averagingDouble(Grocery::getPrice));
        log("Computer averange price ",computePriceAvg);
    }

    public static void phoneAvg(List<Grocery> groceries) {
        double phoenPriceAvg = groceries.stream().filter(Grocery::isPhone).collect(Collectors.averagingDouble(Grocery::getPrice));
        log("Phone averange price ",phoenPriceAvg);
    }
}
