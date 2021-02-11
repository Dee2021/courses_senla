package com.structure;

import com.container.Container;

public class Ship {

    public Deck[] decks;
    int i=0;


    public Ship(int numDecks) {
        if (numDecks!=1 && numDecks!=2){

            System.out.println("Слишком много палуб");

        }
        else {
            decks = new Deck[numDecks];
        }
    }
    public void AddDeck(Deck dck){
        if(i<decks.length) {
            decks[i] = dck;
            i++;
        }
    }


    public int MassShip(){
        int mass = 0;
        for (int j=0;j<decks.length;j++){
            if(decks[j]!=null){
                mass = mass+decks[j].MassDeck();

            }


        }
        return mass;
    }





}
