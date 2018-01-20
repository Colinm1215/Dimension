package com.Dimension.matter;
import java.awt.*;
import java.util.ArrayList;

import com.Dimension.particles.Electron;
import com.Dimension.particles.Neutron;
import com.Dimension.particles.Proton;

public class Atom {
    ArrayList<Proton> protons = new ArrayList<>();
    ArrayList<Neutron> neutrons = new ArrayList<>();
    ArrayList<Electron> electrons = new ArrayList<>();
    int charge;
    Color color;
    int xloc;
    int yloc;
    int energy;
    int speed;
    public Atom(int protonsnum, int neutronsnum, int electronsnum, Color color, int xloc, int yloc, int energy) {
        for (int i = 0; i <= protonsnum; i++) {
            protons.add(new Proton());
        }
        for (int i = 0; i <= neutronsnum; i++) {
            neutrons.add(new Neutron());
        }
        for (int i = 0; i <= electronsnum; i++) {
            electrons.add(new Electron());
        }
        charge = protonsnum - electronsnum;
        this.color = color;
        this.xloc = xloc;
        this.yloc = yloc;
        this.energy=energy;
        speed=energy/30;

    }

    public void Draw(Graphics2D g2) {
        g2.setColor(color);
        g2.fillOval(xloc, yloc, 20, 20);
    }
    public void Move(){
        speed=(int)(Math.random()*(2*(energy/30))-(energy/30));
        xloc+=speed;
        speed=(int)(Math.random()*(2*(energy/30))-(energy/30));
        yloc+=speed;


    }

}