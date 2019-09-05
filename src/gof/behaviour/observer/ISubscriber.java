package gof.behaviour.observer;

public interface ISubscriber {
    void setPublisher(IPublish obj);
    void update();
}
