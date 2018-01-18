package com.Dimension.particles;
import java.util.*;


public class Proton {

    public Proton () {
        int charge = 1;
        List quarks = new ArrayList();
        quarks.add(new upQuark());
        quarks.add(new upQuark());
        quarks.add(new downQuark());

    }
}