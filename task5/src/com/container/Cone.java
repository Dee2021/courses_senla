package com.container;

public class Cone extends Container{
    public Cone(boolean smallSize, Density a) {

        SetSize(smallSize);
        SetDensity(a);
    }

    @Override
    public int Volume() {
        return (int)(Math.PI*width*width/12*height);
    }

}
