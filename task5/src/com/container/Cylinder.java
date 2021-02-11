package com.container;

public class Cylinder extends Container{
    public Cylinder(boolean smallSize, Density a) {

        SetSize(smallSize);
        SetDensity(a);
    }

    @Override
    public int Volume() {
        return (int)(Math.PI * width * width/4*height);
    }

}