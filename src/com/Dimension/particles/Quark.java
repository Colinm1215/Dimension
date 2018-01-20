package com.Dimension.particles;


@SuppressWarnings("ALL")
public class Quark {
    public Charge cha;
    public Quark (Charge ch) {
        this.cha = ch;
    }
    public String toString()
    {
        return("Quark Charge:" + cha);
    }
    public double getCha() {
        return cha.getCharge();
    }
}


class upQuark extends Quark {

    public upQuark(){
        super(new Charge((2)));
    }

}


class downQuark extends Quark {

    public downQuark(){
        super(new Charge((-1)));
    }

}