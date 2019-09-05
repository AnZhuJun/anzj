package gof.behaviour.observer;

public class DemoObserver {
    public static void main(String[] args) {
        PublisherImpl publisher = new PublisherImpl();

        ISubscriber tom = new MessageSubscriber("Tom");
        ISubscriber jerry = new MessageSubscriber("jerry");
        ISubscriber michael = new MessageSubscriber("michael");

        publisher.register(tom);
        publisher.register(jerry);
        publisher.register(michael);

        tom.update();

        publisher.postMessage("*** and *** divoiced");
    }
}
