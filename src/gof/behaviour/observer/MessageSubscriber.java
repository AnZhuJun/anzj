package gof.behaviour.observer;

public class MessageSubscriber implements ISubscriber{
    private IPublish publisher;
    private String name;

    public MessageSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void setPublisher(IPublish obj) {
        this.publisher = obj;
    }

    @Override
    public void update() {
        String msg = (String) publisher.getUpdate(this);
        if(msg == null){
            System.out.println(name + ":: No new message");
        }else{
            System.out.println(name + ":: New message::" + msg);
        }
    }
}
