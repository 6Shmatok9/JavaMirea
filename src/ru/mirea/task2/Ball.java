public class Ball {
    private String color;
    private int radius;
    public Ball (String c, int r) {
        color = c;
        radius = r;
    }
    public Ball (String c) {
        color = c;
        radius = 10;
    }
    public Ball (int r) {
        color = "red";
        radius = r;
    }
    public Ball () {
        color = "red";
        radius = 10;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public void setRadius (int radius) {
        this.radius = radius;
    }
    public String getColor () {
        return color;
    }
    public int getRadius() {
        return radius;
    }
    public double getArea() {
        return 4.0 * Math.PI * radius*radius;
    }
    public double getSize() {
        return (4.0/3.0) * Math.PI * radius*radius*radius;
    }
    public String toString () {
        return "Мяч цвета " + this.color + ", c радиусом, равным "+
                this.radius + ", имеет площадь, равную " + this.getArea() + " и объём, равный " + this.getSize();
    }
}
