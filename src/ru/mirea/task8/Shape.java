package ru.mirea.task8;

import java.awt.Color;

public abstract class Shape {

    public Color color;
    public int x;
    public int y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getShape()
    {
        String s1 = "";
        String s2 = "" + this.getClass();
        int n = s2.length();
        for (int i = 18; i < n; i++)
            s1 = s1 + s2.charAt(i);
        return(s1);
    }

}


class Rectangle extends Shape
{
    public Rectangle(Color color, int x, int y)
    {
        super(color, x, y);
    }
}

class Circle extends Shape
{
    public Circle(Color color, int x, int y)
    {
        super(color, x, y);
    }
}

class Line extends Shape
{
    public Line(Color color, int x, int y)
    {
        super(color, x, y);
    }
}
