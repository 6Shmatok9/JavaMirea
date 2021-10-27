package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame{
    int count = 0;
    int hiddenNumber = (int) (Math.random() * 20);
    JButton check = new JButton("Проверка");
    JTextField num = new JTextField(2);
    JLabel message = new JLabel("Введите число");

    public Game() {
        super("Игра-угадайка");
        setLayout(null);
        setSize(400, 400);
        Font font = new Font("Calibri", Font.BOLD, 30);
        Font font2 = new Font("Calibri", Font.PLAIN, 35);
        Font font3 = new Font("Calibri Light", Font.PLAIN, 40);

        add(check);
        check.setBounds(100,  200, 200, 80);
        check.setFont(font);

        add(num);
        num.setBounds(130, 110, 140, 60);
        num.setFont(font2);

        add(message);
        message.setVerticalAlignment(JLabel.CENTER);
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setBounds(0, 40, 400, 40);
        message.setFont(font3);

        check.addMouseListener(new MouseListener() {

            public void mouseExited(MouseEvent a) {}

            public void mouseClicked(MouseEvent a) {
                try {
                    count++;
                    if (hiddenNumber == Integer.parseInt(num.getText()) && count <= 3) {
                        JOptionPane.showMessageDialog(null, "Победа!");
                    } else if (count < 3 && hiddenNumber > Integer.parseInt(num.getText())) {
                        JOptionPane.showMessageDialog(null, "Число меньше загаданного");
                    } else if (count < 3 && hiddenNumber < Integer.parseInt(num.getText())) {
                        JOptionPane.showMessageDialog(null, "Число больше загаданного");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Game Over!");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Введите число!");
                }
            }

            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Game().setVisible(true);
    }
}