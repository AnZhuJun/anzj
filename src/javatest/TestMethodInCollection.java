package javatest;

import java.util.HashSet;
import java.util.Set;

public class TestMethodInCollection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("LiuBei");
        set1.add("HuangZhong");
        set1.add("CaoCao");
        set1.add("DiaoChan");
        set1.add("GuanYu");
        set1.add("SunQuan");

        System.out.println("Set 1 is " + set1 );
        System.out.println("Size : " + set1.size());

        Set<String> set2 = new HashSet<>();
        set2.add("SunQuan");
        set2.add("DaQiao");
        set2.add("XiaoQiao");

        set2.addAll(set1);
        System.out.println(set2);

        set2.retainAll(set1);

        System.out.println(set1);
        System.out.println(set2);
    }
}
