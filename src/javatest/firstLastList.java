package javatest;

class Link{
    public long dData;
    public Link next;

    public Link(long d){
        dData = d;
    }

    public void displayLink(){
        System.out.println(dData + " ");
    }
}

class FirstLasLisk{
    private Link first;
    private Link last;

    public FirstLasLisk(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(long dd){
        Link newLink = new Link(dd);
        if(isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd){
        Link newLink  = new Link(dd);
        if(isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public long deleteFirst(){
        long temp = first.dData;
        if(first.next == null)
            last = null;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List(first->last)");
        Link current = first;
        while(current!=null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}

public class firstLastList {
    public static void main(String[] args) {
        FirstLasLisk theList = new FirstLasLisk();

        theList.insertFirst(22);
        theList.displayList();
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.displayList();

        theList.insertLast(33);
        theList.displayList();
        theList.insertLast(55);
        theList.insertLast(77);
        theList.displayList();

        theList.deleteFirst();
        theList.displayList();

        theList.deleteFirst();
        theList.displayList();
    }
}
