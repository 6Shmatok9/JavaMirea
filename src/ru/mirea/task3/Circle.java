package ru.mirea.task3;

public class Circle {
    private String color;
    private int radius;
    public Circle (String c, int r) {
        color = c;
        radius = r;
    }
    public Circle (String c) {
        color = c;
        radius = 10;
    }
    public Circle (int r) {
        color = "red";
        radius = r;
    }
    public Circle () {
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
        return Math.PI * radius*radius;
    }
    public String toString () {
        return "Круг цвета " + this.color + ", c радиусом, равным "+
                this.radius + ", имеет площадь, равную " + this.getArea();
    }
}
