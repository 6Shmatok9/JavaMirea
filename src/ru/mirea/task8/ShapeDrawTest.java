package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class ShapeDrawTest
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Shapes");
        JPanel render = new ShapeDraw();
        frame.setSize(670, 670);
        frame.add(render);
        frame.setVisible(true);
    }
}
