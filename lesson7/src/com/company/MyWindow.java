package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    JFrame jfthis;

      public MyWindow(){

          setBounds(800,300,400,400);
          setTitle("Tik-Tak-Toe");
          setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
          //setResizable(false); не тянется экран
          setLayout(new BorderLayout());
           jfthis = this;
          JPanel jpBottom = new JPanel(new GridLayout(2,2));

          JButton jb1 = new JButton("#1");
          JButton jb2 = new JButton("#2");
          JButton jb3 = new JButton("#3");
          JButton jb4 = new JButton("#4");

          jb1.setForeground(Color.blue);

          jpBottom.add(jb1);
          jpBottom.add(jb2);
          jpBottom.add(jb3);
          jpBottom.add(jb4);

          jb1.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  System.out.println("#1");
                  JOptionPane.showMessageDialog(jfthis,"Hello");
              }
          });

          add(jpBottom, BorderLayout.SOUTH);
          jpBottom.setPreferredSize(new Dimension(1,120));

          //add(jb1, BorderLayout.CENTER);
          //JButton jb2 = new JButton("Hello2");
          //jb2.setPreferredSize(new Dimension(2,100));
          //add(jb2, BorderLayout.NORTH);

          //setResizable(false); фиксированный размер окна
          //setLayout(new FlowLayout()); расположение по горизонтали
          //setLayout( new GridLayout(2,2)); расположение по сетке
          //setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS)); расположение по Х или У оси

          /*setLayout(null);
          jb1.setBounds(10,10,20,30);расположение по координатам*/



          setVisible(true);

}



}
