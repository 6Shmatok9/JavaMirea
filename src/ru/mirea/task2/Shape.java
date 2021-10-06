package ru.mirea.task2;

public class Shape {
    private String color;
    private String type;
    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }
    public String toString() {
        return("Фигура " + type + ", цвета " + color);
    }
}
