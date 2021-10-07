package ru.mirea.task7;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String toString() {
        return("\n");
    }
}

class Circle extends Shape{
    protected double radius;
    public Circle(){
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }
    public Circle(double radius){
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}

class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle() {
        width = 0;
        length = 0;
        this.color = "blue";
        this.filled = false;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.color = "blue";
        this.filled = false;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return(width*length);
    }

    public double getPerimeter() {
        return(2*(width+length));
    }

    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length+", color: "+this.color;
    }
}

class Square extends Rectangle
{
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setWidth(double side) {
        width = side;
    }

    public void setLength(double side) {
        length = side;
    }

    public String toString() {
        return "Shape: square, side: "+this.width+", color: "+this.color;
    }
}

