package collection.grocerys;

import concurrency.lock.BasicReadWriteLock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Grocery {
    HashMap<String,ArrayList<String>> grocery = new HashMap<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();
    private Integer counter = 0;


    public Grocery() {
        System.out.println("you have " + grocery.size() + " items currently");
        for(Map.Entry<String,ArrayList<String>> item: grocery.entrySet()){
            System.out.println(item);
        }

        ArrayList<String> phoneList = new ArrayList<>();
        grocery.put("phone",phoneList);

        ArrayList<String> foodList = new ArrayList<>();
        grocery.put("food",foodList);

        ArrayList<String> keyboardList = new ArrayList<>();
        grocery.put("keyboard",keyboardList);
    }

    private static class Reader implements Runnable{
        Grocery object;
        public Reader(Grocery object) {
            this.object = object;
        }

        @Override
        public void run() {
            object.toString();
        }
    }

    public void addItem(String key,String value){
        try {
            writeLock.lock();
            ArrayList<String> arr = grocery.get(key);
            arr.add(value);
            grocery.replace(key, arr);
            System.out.println(key + " and " + value + " added ");
            Thread.sleep(0000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            writeLock.unlock();
        }
    }

    public void delItemByValue(String key,String item){
        ArrayList<String> arrayList = grocery.get(key);
        arrayList.remove(item);
        grocery.replace(key,arrayList);
        System.out.println(item + " removed");
    }

    public void modifyItem(String key,String item,String value){
        System.out.println(grocery.get(key) + " modified to " + value);
        ArrayList<String> temp= grocery.get(key);
        int position = temp.indexOf(item);
        temp.set(position,value);
        grocery.replace(key,temp);
    }

    public ArrayList<String> getItems(String key){
        return grocery.get(key);
    }

    public int getItemSize(String key){
        return grocery.get(key).size();
    }

    public ArrayList<String>  findItem(String key){
        try {
            readLock.lock();

            if (grocery.containsKey(key)) {
                System.out.println(key + " found");
                return grocery.get(key);
            }

            System.out.println(key + " not found");
            return null;
        }finally {
            readLock.unlock();
        }
    }

    public int total(){
        try {
            readLock.lock();
            return grocery.size();
        }finally {
            readLock.unlock();
        }
    }

    @Override
    public String toString() {
        return grocery.toString();
    }
}
