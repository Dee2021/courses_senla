package com.container;

public abstract class Container {
    public int height;
    public boolean smallSize;    //smallSize true если маленький, false если большой
    int width;  // 20 у большого, 10 у маленького
    public enum Density {
        DENSITY1000, DENSITY2000
    }
    final int DENSITY1000 = 1000;
    final int DENSITY2000 = 2000;
    int ro;

    abstract int Volume();


    public void SetSize(boolean smallSize) {
        this.smallSize = smallSize;
        height = (int) (10 + Math.random() * 90);
        if (smallSize == true) {
            width = 10;
        } else {
            width = 20;
        }
    }

    public void SetDensity(Density a){
        if (a == Density.DENSITY1000){
            ro = DENSITY1000;
        }
        if (a == Density.DENSITY2000){
            ro = DENSITY2000;
        }
    }

    public int MassCont(){

        return Volume()*ro;

    }

}
