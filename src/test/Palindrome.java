package test;


import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        boolean isp = isPalindrome(121);
        System.out.println(isp);
    }

    public static boolean isPalindrome(Integer x){
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//
//
//        if(x>0) {
//            for (int i = 10; i < 10000; i = i * 10) {
//                list.add(x%i);
//            }
//        }
//
//        for(Integer i:list){
//            list1.add(0,i);
//        }
//
//        boolean isp = list.equals(list1);
//        return isp;

        int reverse = 0;
        while(x>reverse){
            reverse = reverse * 10  + x%10;
            x = x/10;
        }

        return reverse==x||reverse/10 == x;


    }
}
