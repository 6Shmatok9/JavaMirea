package ru.mirea.task5;

public class TestDish {
    public static void main(String[] args) {
        Pan d1 = new Pan(1000,"black", true);
        Plate d2 = new Plate (500,"white", 30);
        Cup d3 = new Cup(400,"red","glass");
        d1.displayInfo();
        d2.displayInfo();
        d3.displayInfo();
    }
}
