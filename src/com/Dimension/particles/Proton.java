package com.Dimension.particles;
import java.util.*;


public class Proton {

    public Proton () {
        int charge = 1;
        ArrayList<Quark> quarks = new ArrayList<>();
        quarks.add(new upQuark());
        quarks.add(new upQuark());
        quarks.add(new downQuark());
        double tch = 0;
        for (Quark q : quarks) {
            System.out.println(q.toString());
            tch += q.getCha();
        }
        System.out.println("Total Charge:" + tch);
    }
}