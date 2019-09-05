package collection.grocerys;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Entry {
    private static Grocery grocery = new Grocery();

    public static class Readers implements Runnable{
        Grocery grocery;

        public Readers(Grocery grocery){
            this.grocery = grocery;
        }

        @Override
        public void run() {
            System.out.println(grocery.toString());
        }
    }


    public static void main(String[] args) {
        grocery.addItem("phone","huawei");
        grocery.addItem("phone","mi");
        grocery.addItem("phone","zhong xing");
        grocery.addItem("keyboard","Razer");
        grocery.addItem("food","beef");
        grocery.addItem("food","bean");
        grocery.addItem("food","apple");
        grocery.addItem("food","banana");

        final ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.execute(new Thread(new Readers(grocery),"reade1"));
        executor.shutdown();

        System.out.println("Total number of " + grocery.total());

        grocery.delItemByValue("phone","mi");

        grocery.modifyItem("phone","huawei","huawei p30");
        System.out.println(grocery.toString());

        ArrayList<String> pen = grocery.findItem("food");
        System.out.println(pen);

        System.out.println("Total number of " + grocery.total());
        System.out.println("Item are " + grocery.toString());

        System.out.println(grocery.getItems("keyboard"));
        System.out.println("total phone " + grocery.getItemSize("phone"));
        System.out.println("total phone " + grocery.getItemSize("food"));


//
//        System.out.println();
//        System.out.println("please input the way you want to do: ");
//        System.out.println("1.add");
//        System.out.println("2.modify");®
//        System.out.println("3.deleteByPosition");
//        System.out.println("4.deleteByValue");
//        System.out.println("5.show all item");
//        System.out.println("6.exit");
//
//        Scanner input = new Scanner(System.in);
//        int wayNum = input.nextInt();
//
//        while (wayNum!=6) {
//            switch (wayNum) {
//                case 1:
//                    String addKey = input.next();
//                    String addValue = input.next();
//                    grocery.addItem(addKey, addValue);
//                    System.out.println(grocery.toString());
//                    break;
//                case 2:
//                    String modKey = input.next();
//                    String modItem = input.next();
//                    String modValue = input.next();
//                    grocery.modifyItem(modKey,modItem,modValue);
//                    System.out.println(grocery.toString());
//                    break;
//                case 3:
//                    int delNum = input.nextInt();
//                    grocery.delItemByPos(delNum);
//                    System.out.println(grocery.toString());
//                    break;
//                case 4:
//                    String delVKey = input.next();
//                    String delVItem = input.next();
//                    grocery.delItemByValue(delVKey,delVItem);
//                    System.out.println(grocery.toString());
//                    break;
//                case 5:
//                    System.out.println(grocery.toString());
//                    break;
//                case 6:
//                    break;
//
//            }
//
//            System.out.println();
//            System.out.println("please input the way you want to do: ");
//            System.out.println("1.add");
//            System.out.println("2.modify");
//            System.out.println("3.deleteByPosition");
//            System.out.println("4.deleteByValue");
//            System.out.println("5.show all item");
//            System.out.println("6.exit");
//            wayNum = input.nextInt();
//        }
    }
}
