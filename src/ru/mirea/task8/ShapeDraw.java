package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapeDraw extends JPanel
{
    public ShapeDraw(){};

    public void paint(Graphics g)
    {
        super.paint(g);
        Shape shape = new Rectangle(Color.BLACK, 0, 0);
        java.awt.Color color = Color.BLACK;
        Random random = new Random();
        int c;
        for (int i = 0; i < 20; i++)
        {
            c = random.nextInt(8-0);
            switch (c)
            {
                case 0:
                {
                    color = Color.BLACK;
                    break;
                }
                case 1:
                {
                    color = Color.RED;
                    break;
                }
                case 2:
                {
                    color = Color.BLUE;
                    break;
                }
                case 3:
                {
                    color = Color.YELLOW;
                    break;
                }
                case 4:
                {
                    color = Color.GREEN;
                    break;
                }
                case 5:
                {
                    color = Color.ORANGE;
                    break;
                }
                case 6:
                {
                    color = Color.PINK;
                    break;
                }
                case 7:
                {
                    color = Color.GRAY;
                    break;
                }
            }
            c = random.nextInt(3-0);
            switch (c)
            {
                case 0:
                {
                    shape = new Rectangle(color, i * 30, i * 30);
                    g.drawRect(shape.x, shape.y, 30, 30);
                    break;
                }
                case 1:
                {
                    shape = new Line(color, i * 30, i * 30);
                    g.drawLine(shape.x, shape.y, shape.x + 30, shape.y + 30);
                    break;
                }
                case 2:
                {
                    shape = new Circle(color, i * 30, i * 30);
                    g.drawOval(shape.x, shape.y, 30, 30);
                    break;
                }
            }
            g.setColor(shape.color);
        }
    }
}

