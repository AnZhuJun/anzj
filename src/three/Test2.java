package three;

public class Test2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("名字" + rectangle.getName());
        System.out.println("面积" + rectangle.getArea());

        Circle circle = new Circle(2);
        System.out.println("name : " + circle.getName());
        System.out.println("area : " + circle.getArea());
    }
}
