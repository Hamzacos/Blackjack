package com.example;

public enum Number {
    
    ACE("1", 11),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4",4),
    FIVE("5",5),
    SIX("6",6),
    SEVEN("7",7),
    EIGHT("8",8),
    NINE("9",9),
    TEN("10",10),
    JACK("11",10),
    QUEEN("12",10),
    KING("13",10);

    int numberValue;
    String number;

    Number(String number , int numberValue){
        this.numberValue = numberValue;
        this.number  = number;
    }

    public String toString(){
        return number;
    }

    public Card getType() {
        return null;
    }

}
