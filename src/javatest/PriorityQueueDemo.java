package javatest;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        queue1.offer(4);
        queue1.offer(2);
        queue1.offer(3);
        queue1.offer(1);
        queue1.offer(7);

        System.out.println(queue1);

        PriorityQueue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder());
        queue2.offer("HuangZhong");
        queue2.offer("LiuBei");
        queue2.offer("CaoCao");
        queue2.offer("ZhangFei");
        queue2.offer("YuanShao");
        queue2.offer("HuangGai");
        queue2.offer("HuangZ");

        while(queue2.size()>0) {
            System.out.println(queue2.remove() + " ");
        }
    }
}
