package javatest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("LiuBei");
        set.add("HuangZhong");
        set.add("SunQuan");
        set.add("CaoCao");
        set.add("GuanYu");



        TreeSet<String> treeSet = new TreeSet<>(set);

        System.out.println(treeSet);
        System.out.println("first()" + treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet("HuangZhong"));
        System.out.println();
        System.out.println();
        System.out.println();


    }
}
