package ru.mirea.task8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

class ImageRun extends JFrame {
    public void paint(Graphics g)
    {
        super.paint(g);
        try {
            Image img = ImageIO.read(new File(getArgs()[0]));
            g.drawImage(img, 0, 0, null);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public ImageRun()
    {
        super("Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,965);
        setVisible(true);
    }

    private static void createAndShowGUI() {
        ImageRun img = new ImageRun();
    }

    private static String[] savedArgs;
    public static String[] getArgs() { return savedArgs; }
    public static void main(String[] args) {
        savedArgs = args;
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createAndShowGUI(); }
        });
    }
}