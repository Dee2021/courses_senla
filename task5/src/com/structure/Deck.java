package com.structure;
import com.container.Container;
import com.container.Cylinder;

public class Deck {



    public Container[] containers = new Container[4];
    int i = 0;


    public void AddContainer(Container cnt){

        if (i>3 || (i==3&&!cnt.smallSize)) {

            System.out.println("Слишком много контейнеров");
        }

        else{

            containers[i] = cnt;
            i++;

            if(!cnt.smallSize){

                i=i+1;
            }


        }


    }


    public int MassDeck(){
        int mass = 0;
        for (int j=0;j<containers.length;j++){
            if(containers[j]!=null){
                mass = mass+containers[j].MassCont();

            }


        }

        return mass;


    }



}

