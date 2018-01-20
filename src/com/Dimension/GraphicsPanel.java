package com.Dimension;

import javax.swing.*;
import com.Dimension.matter.Atom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsPanel extends JPanel {
    public int Zaps=100;
    public int x=1; //how many atoms I'll create
    public int zdivision=Zaps/x;
    public Atom[] atoms = new Atom[x];
    public GraphicsPanel(int width, int height) {
        setSize(width, height);
        atoms[0] = new Atom(1,1,1,new Color(255, 224,0), 400, 400, zdivision);
        Zaps-=zdivision;
        Timer timer = new Timer(1000 / 10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //called 60 times per second
                for(Atom b: atoms){
                    b.Move();

                }
                repaint();
            }

        });
        timer.start();

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for(Atom atom: atoms){
            atom.Draw(g2);
        }
    }

}