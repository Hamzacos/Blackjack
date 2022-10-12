package com.example;

public class Card {
    
    private type type;
    private Number number;

    public Card(type type,Number number){
        this.type = type;
        this.number = number;
    }

    public int getValue(){
        return number.numberValue;
    }

    public type getType(){
        return type;
    }

    public Number getNumber(){
        return number;
    }

    public String toString(){
        return ("["+number+" of "+ type + "] ("+this.getValue()+")");

    }
}
