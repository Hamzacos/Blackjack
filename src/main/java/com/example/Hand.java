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

    public int valueSum(){
        int value = 0;
        int sumofAce = 0;
        
        for(Card card : hand){
            value += card.getValue();
            if(card.getValue() == 11){
                sumofAce++;
            }
        }
        if(value > 21 && sumofAce > 0){
            while(sumofAce > 0 && value > 21){
                sumofAce--;
                value -= 10;
            }
        }
        return value;

    }

    

    public String toString(){

        String output = "";
        for(Card card : hand){
            output += card + " - "; 
        }
        return output;
    }
}
