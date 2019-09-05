package javatest;

class Link1{
    public long dData;
    public Link1 next;

    public Link1(long dd){
        dData = dd;
    }

    public void displayit(){
        System.out.println(dData + " ");
    }
}

class LinkList{
    private Link1 first;

    public LinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(long dd){
        Link1 newLink = new Link1(dd);
        newLink.next = first;
        first = newLink;
    }

    public long deleteFirst(){
        Link1 temp = first;
        first = first.next;
        return temp.dData;
    }

    public void displayList(){
        Link1 current = first;
        while(current != null)
        {
            current.displayit();
            current = current.next;
        }

        System.out.println(" ");
    }
}

class LinkStack{
    private LinkList theList;

    public LinkStack(){
        theList = new LinkList();
    }

    public void push(long j){
        theList.insertFirst(j);
    }

    public long pop(){
        return theList.deleteFirst();
    }

    public boolean isEmpty(){
        return theList.isEmpty();
    }

    public void displayStack(){
        System.out.println("Stack (pop->bottom)");
        theList.displayList();
    }
}

public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();

        System.out.println(linkStack.isEmpty());

        linkStack.push(1);
        linkStack.displayStack();
        linkStack.push(5);
        linkStack.push(2);
        linkStack.push(72);
        linkStack.displayStack();
        linkStack.push(32);
        linkStack.displayStack();

        System.out.println(linkStack.isEmpty());

        while(!linkStack.isEmpty()) {
            System.out.println(linkStack.pop());
        }
    }
}
