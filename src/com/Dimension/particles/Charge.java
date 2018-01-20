package com.Dimension.particles;


public class Charge {
    private double charge;
    public Charge(double ch) {
        this.charge = ch/3;
    }
    public String toString()
    {
        return(Double.toString(charge));
    }
    public double getCharge() {
        return charge;
    }
}
