package com.Dimension;

import javax.swing.*;
import java.awt.*;

public class Main {
 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Universe Sim");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 824;
        frame.setPreferredSize(new Dimension(width, height));
        JPanel panel = new GraphicsPanel(width, height);
        panel.setFocusable(true);
        panel.grabFocus();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}