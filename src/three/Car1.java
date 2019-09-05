package three;

public class Car1 {
    private String name;
    private String speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        StringBuilder sb  = new StringBuilder();
        sb.append("neme: " + name + ",");
        sb.append("speed: " + speed);
        return sb.toString();
    }
}