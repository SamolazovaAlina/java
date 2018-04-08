package com.company;

import sun.text.resources.cldr.ia.FormatData_ia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameMap extends JPanel{

    private final int cells_count = 5;
    private final int size = 500;
    private final int cell_size = size/cells_count;


    public GameMap(){

        setBackground(Color.white);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getButton()== MouseEvent.BUTTON1){
                    int x = e.getX()/cell_size;
                    int y = e.getY()/cell_size;
                    System.out.println(x+" / "+ y);
                    repaint();
                }
                super.mouseReleased(e);
            }
        });
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);

        for (int i = 0; i < cells_count; i++) {
            g.drawLine(0,i*cell_size, size, i*cell_size);
            g.drawLine(i*cell_size, 0,i*cell_size,size);
            
        }
        g.drawRect(0,0,size-1,size-1);
    }

}
