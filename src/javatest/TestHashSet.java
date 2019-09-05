package javatest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("LiuBei");
        set.add("GuanYu");
        set.add("ZhangFei");
        set.add("CaoCao");
        set.add("HuangZhong");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
