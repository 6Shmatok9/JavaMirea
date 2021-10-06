package ru.mirea.task3;

public class Head
{
    private String hairColor;
    private double radius;
    public Head(double r, String hc) {
        radius = r;
        hairColor = hc;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public double getRadius() {
        return radius;
    }
    public String getHairColor() {
        return hairColor;
    }
    public double getArea()
    {
        return(4 * Math.PI * radius * radius);
    }
    public double getSize() { return((4/3) * Math.PI * radius * radius * radius); }
}
