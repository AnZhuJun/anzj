package java8.grocery;

public class Grocery {
    public enum Type{
        food,phone,computer
    }

    private Long id;
    private String name;
    private Type type;
    private double price;

    public Grocery(Long id, String name, Type type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPhone(){
        return this.type == Type.phone;
    }

    public boolean isComputer(){
        return this.type == Type.computer;
    }

    public boolean isFood(){
        return this.type == Type.food;
    }

    @Override
    public String toString() {
        return "Item{name= " + getName() +" ,type= " + getType() + " ,price= " + getPrice() + " ,id= " + getId() + "}\n";
    }
}
