package generics;

import java.util.HashMap;

public class WordCount {

    public static void main(String[] args) {
        String sentence = "Hi hello Hi Hello Hi hi hi sync extream agile";
        String[] words = sentence.split(" ");

        wordPrint(words);

        Integer[] nums = {1,4,2,4,15,2,45,234,23,1,2,3,5,324};
        wordPrint(nums);

    }

    private static <T> void wordPrint(T array[]) {
        HashMap<T,Integer> mapNum = wordCount(array);
        System.out.println(mapNum);
    }

    private static <T>HashMap<T,Integer> wordCount(T group[]){
        HashMap<T,Integer> map = new HashMap<>();
        for(T member : group){
            if(map.get(member)==null){
                map.put(member,1);
            }else{
                map.put(member,map.get(member) + 1);
            }
        }
        return map;
    }

}