package com.container;

import com.structure.Deck;

public class Box extends Container{
    public Box(boolean smallSize, Density a) {
        SetSize(smallSize);
        SetDensity(a);
    }




    @Override
    public int Volume() {
        return width * width / 2 * height;
    }

}
