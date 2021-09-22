public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle("blue", 15);
        Circle c2 = new Circle("black");
        c2.setRadius(20);
        Circle c3 = new Circle(4);
        c3.setColor("white");
        Circle c4 = new Circle();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}

