package collection.grocery;

import java.util.Scanner;

public class Operator {
    private static Scanner scanner = new Scanner(System.in);
    private Grocery grocery;

    public Operator(Grocery grocery){
        this.grocery = grocery;
    }

    public void printInstructions(){
        System.out.println("0. Instruction " + "1. List items " + "2. Add Item " + "3. Modify Item" + "4. Remove Item " + "5. Search Item " + "6. Quit");
    }

    public void run(){
        boolean quit = false;
        int chioce = 0;

        while(!quit){
            System.out.println("Enter your choice:");
            chioce = scanner.nextInt();
            scanner.nextLine();

            switch (chioce){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    grocery.listAll();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    findItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    break;
            }

        }
    }

    private void findItem() {
        System.out.println("Enter the item to search");
        String item = scanner.nextLine();
        grocery.findItem(item);

    }

    private void deleteItem() {
        System.out.println("Enter position to remove");
        int position = scanner.nextInt();
        grocery.delItemByPos(position-1);
    }

    private void modifyItem() {
        System.out.println("Enter position to modify");
        int position = scanner.nextInt();
        scanner.nextLine();

        if(position >= grocery.total()){
            System.out.println("position overflow");
        }

        System.out.println("Enter new item");
        String item = scanner.nextLine();
        grocery.modifyItem(position-1,item);
    }

    private void addItem() {
        System.out.println();
        grocery.addItem(scanner.nextLine());
    }

    public static void main(String[] args) {
        Grocery grocery = new Grocery();
        Operator operator = new Operator(grocery);

        operator.printInstructions();

        operator.run();
    }

}
