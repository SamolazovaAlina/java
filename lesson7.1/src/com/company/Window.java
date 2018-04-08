package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Window extends JFrame {

    public Window() {
        setBounds(500, 100, 506, 569);
        setTitle("Tik-Tak-Toe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel bottomPanel = new JPanel(new GridLayout());
        JButton jbNewGame = new JButton("Start Game");
        JButton jbExitGame = new JButton("Exit Game");

        jbExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
    });


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("BYE");
            }

    });


        bottomPanel.add(jbNewGame);
        bottomPanel.add(jbExitGame);

        add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.setPreferredSize( new Dimension(1, 40));


        GameMap gamePanel = new GameMap();
        add(gamePanel, BorderLayout.CENTER);



        setVisible(true);
        System.out.println(gamePanel.getWidth()+ " "+gamePanel.getHeight());
    }
}

