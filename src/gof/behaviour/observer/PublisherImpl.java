package gof.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements IPublish {
    private List<ISubscriber> subscribers;
    private String message;
    private boolean changed;
    private final Object NUTEX = new Object();

    public PublisherImpl(){
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void register(ISubscriber obj) {
        if(obj == null){
            throw new NullPointerException("Null Subscriber");
        }
        synchronized (NUTEX){
            if(!subscribers.contains(obj)){
                subscribers.add(obj);

                obj.setPublisher(this);
            }
        }
    }

    @Override
    public void unregister(ISubscriber obj) {
        synchronized (NUTEX){
            subscribers.remove(obj);
        }
    }

    @Override
    public void notifySubscribers() {
        List<ISubscriber> subscribers;

        synchronized (NUTEX){
            if(!changed){
                return;
            }
            subscribers = new ArrayList<>(this.subscribers);
            this.changed = false;
        }

        for(ISubscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    @Override
    public Object getUpdate(ISubscriber obj) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message post to " + msg);
        this.message = msg;
        this.changed = true;
        notifySubscribers();
    }
}
