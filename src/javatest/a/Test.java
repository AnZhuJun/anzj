package javatest.a;

import java.util.Map;

class Node{
    Node next = null;
    int data;
    public Node(int data){
        this.data = data;
    }
}


public class Test {
    public static Node mergeList(Node head1,Node head2){
        if(head1 == null)
            return head2;
        if(head2 == null)
            return head1;

        Node head = null;
        if(head1.data < head2.data)
        {
            head = head1;
            head.next = mergeList(head1.next,head2);
        }
        else
        {
            head = head2;
            head.next = mergeList(head1,head2.next);
        }

        return head;
    }

    public static void main(String[] arg){
        Node head1 = new Node(1);
        Node head3 = new Node(3);
        Node head5 = new Node(5);
        head1.next = head3;
        head3.next = head5;
        head5.next = null;

        Node head2 = new Node(2);
        Node head4 = new Node(4);
        Node head6 = new Node(6);
        head2.next = head4;
        head4.next = head6;
        head6.next = null;

        Node head = mergeList(head1,head2);
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
