package test;

import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        String n1 = addNum(56);
        String n2 = addNum(121);
        System.out.println(n1);
        System.out.println(n2);
    }

    private static String addNum(int number) {
        int[] numbers = {1,3,5,9,12,55,66};
        int flag = numbers.length;
        for(int i=0;i<numbers.length;i++){
            if(number < numbers[i]){
                flag = i;
            }
        }

            for (int i = 0; i < flag - 1; i++) {
                for (int j = i + 1; j < flag; j++) {
                    if (numbers[i] + numbers[j] == number) {
                        return "[" + i + "," + j + "]";
                    }
                }
            }

        return "none";
    }
}
