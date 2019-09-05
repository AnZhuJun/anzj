package test;

public class Test {
    public static void main(String[] args) {
        boolean isSleep1 = sleepIn(false,false);
        boolean isSleep2 = sleepIn(true,false);
        boolean isSleep3 = sleepIn(false,true);

        System.out.println(isSleep1);
        System.out.println(isSleep2);
        System.out.println(isSleep3);
    }

    public static boolean sleepIn(boolean weekday,boolean vocation){
        if (weekday == true&& vocation == false){
            return false;
        }

        return true;
    }
}
