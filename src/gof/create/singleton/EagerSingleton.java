package gof.create.singleton;

class Eager{

    private static final Eager instatnce = new Eager();

    private Eager(){

    }

    public static Eager getInstatnce(){
        return instatnce;
    }

    private String paw = "Meat";

    public String getPaw(){
        return paw;
    }

}

public class EagerSingleton {
    public static void main(String[] args) {
        Eager eager = Eager.getInstatnce();
        System.out.println(eager.getPaw());
    }
}
