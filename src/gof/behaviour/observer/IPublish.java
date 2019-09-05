package gof.behaviour.observer;

public interface IPublish {
    void register(ISubscriber obj);
    void unregister(ISubscriber obj);
    void notifySubscribers();
    Object getUpdate(ISubscriber obj);
}
