package collection.card;
import java.net.CookieHandler;
import java.util.*;

public class SendCards {
    //黑桃spade  红桃heart  梅花club  方块diamond
//    private static ListCard listCard = new ListCard();
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();

        cards.addAll(putCards("spade"));
        cards.addAll(putCards("diamond"));
        cards.addAll(putCards("club"));
        cards.addAll(putCards("heart"));

        System.out.println("原有的卡牌");
        System.out.println(cards);

        Collections.shuffle(cards);

        System.out.println("打乱后的的卡牌");
        System.out.println(cards);

        System.out.println("A获得卡牌" + cards.get(0));
        System.out.println("B获得卡牌" + cards.get(1));
        System.out.println("C获得卡牌" + cards.get(2));
        System.out.println("D获得卡牌" + cards.get(3));


    }

    public static ArrayList<String> putCards(String type){
        ArrayList<String> cards = new ArrayList<>();
        cards.add(type + "A");
        cards.add(type + "2");
        cards.add(type + "3");
        cards.add(type + "4");
        cards.add(type + "5");
        cards.add(type + "6");
        cards.add(type + "7");
        cards.add(type + "8");
        cards.add(type + "9");
        cards.add(type + "10");
        cards.add(type + "J");
        cards.add(type + "Q");
        cards.add(type + "K");

        return  cards;
    }

}
