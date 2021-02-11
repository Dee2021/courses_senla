package com.structure;

public class Port {
    Ship[] ships = new Ship[10];
    int i=0;








    public void Add(Ship ship){
        if (i<=9) {
            ships[i] = ship;
            i++;
        }
        else {

            System.out.println("Слишком много кораблей");
        }

    }

    public void Read(){


        System.out.println("Port=" + ships);


    }

    public void Delete(){


    }

    public int MassPort(){
        int mass = 0;
        for (int j=0;j<ships.length;j++){
            if(ships[j]!=null){
                mass = mass+ships[j].MassShip();

            }


        }
        return mass;
    }

}
