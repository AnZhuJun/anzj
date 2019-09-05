package three;

public class test {
    public static void main(String[] args) {
        String a = "aaa";

        change(a);
        System.out.println(a);
    }

    public static void change(String str){
        str = "bbb";
    }
}
