package com.example;

import java.util.ArrayList;

public class Hand {
    
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<>();
    }

    public void takeCard(listCard list){

        hand.add(list.takeCard());
    }

    public String toString(){

        String output = "";
        for(Card card : hand){
            output += card + " - "; 
        }
        return output;
    }
}
