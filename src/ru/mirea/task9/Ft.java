package ru.mirea.task9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class Ft extends JFrame
{
    int madrid = 0;
    int milan = 0;
    private JLabel labelRes = new JLabel("Result: "+madrid+" X "+milan);
    private JLabel labelLast = new JLabel("Last Scorer: N/A");
    private JLabel labelWin = new JLabel("Winner: Draw");


    public Ft()
    {
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(2,3,50,2));

        container.add(labelLast);
        container.add(labelWin);
        container.add(labelRes);

        JButton buttonMad = new JButton("Madrid");
        container.add(buttonMad);

        JButton buttonMil  = new JButton("Milan");
        container.add(buttonMil);

        buttonMad.addActionListener(new ButtonMadListener());
        buttonMil.addActionListener(new ButtonMilListener());
    }

    public class ButtonMadListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            madrid += 1;
            labelRes.setText("Result: "+madrid+" X "+milan);
            labelLast.setText("Last scorer: Madrid");
            if (madrid > milan)
                labelWin.setText("Winner: Madrid");
            else if (milan > madrid)
                labelWin.setText("Winner: Milan");
            else
                labelWin.setText("Winner: Draw");
        }
    }

    public class ButtonMilListener implements ActionListener
    {
        public void actionPerformed (ActionEvent e)
        {
            milan += 1;
            labelRes.setText("Result: "+madrid+" X "+milan);
            labelLast.setText("Last scorer: Milan");
            if (madrid > milan)
                labelWin.setText("Winner: Madrid");
            else if (milan > madrid)
                labelWin.setText("Winner: Milan");
            else
                labelWin.setText("Winner: Draw");
        }
    }
}