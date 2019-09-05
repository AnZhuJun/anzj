package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid(""));
        System.out.println(isValide("[]"));
        System.out.println(isValide("[]()¡"));
        System.out.println(isValide("{()}"));
        System.out.println(isValide("{(})"));
//        System.out.println(isValid("()"));
    }

    private static boolean isValide(String s){
        char[] stack = new char[s.length() + 1];
        int top = 1;
        for(char c : s.toCharArray()){
            if(c=='(' || c == '[' || c == '{'){
                stack[top] = c;
                top++;
            }else if( c == ')' && stack[--top]!='('){
                return false;
            }else if( c == '}' && stack[--top]!='{'){
                return false;
            }else if( c == ']' && stack[--top]!='['){
                return false;
            }
        }
        return top == 1;
    }

    public static boolean isValid(String string){
        List<String> list = new ArrayList<>();
        String[] temp = new String[string.length()];
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        int index11 = 0;
        int index22 = 0;
        int index33 = 0;

        for(String a:temp){
            list.add(a);
        }

        if(string == null){
            return true;
        }

        System.out.println(list);

        for(String a:list){

            if(a.equals("{")){
                index1 = list.indexOf(a);
            }else if(a.equals("[")){
                index2 = list.indexOf(a);
            }else if(a.equals("(")){
                index3 = list.indexOf(a);
            }

            if(a.equals("}")){
                index11 = list.indexOf(a);
            }else if(a.equals("]")){
                index22 = list.indexOf(a);
            }else if(a.equals(")")){
                index33 = list.indexOf(a);
            }

        }

        if(index1 >= index11){
            if(index2 >= index22){
                if(index3 >= index33){
                    return true;
                }
            }
        }

        return false;
    }
}
