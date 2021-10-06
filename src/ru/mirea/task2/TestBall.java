package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("blue", 15);
        Ball b2 = new Ball("black");
        b2.setRadius(20);
        Ball b3 = new Ball(4);
        b3.setColor("white");
        Ball b4 = new Ball();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
