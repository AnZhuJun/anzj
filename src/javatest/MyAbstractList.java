package javatest;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size = 0;
    protected MyAbstractList(){

    }

    protected MyAbstractList(E[] object){
        for(E e : object)
            add(e);
    }


    @Override
    public void add(E e) {
        add(size,e);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public boolean remove(E e){
        if(indexOf(e)>=0){
            remove(indexOf(e));
            return true;
        }
        else
            return false;
    }
}
