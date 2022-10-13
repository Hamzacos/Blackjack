package com.example;

public abstract class Person {

    private Hand hand ;
    private String name;


    public Person(){
        this.hand = new Hand();
        this.name = "";
    }
    public Hand getHand(){
        return this.hand;
    }

    public void setHand(Hand hand){
        this.hand = hand;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean hasBlackJack(){
        if(this.getHand().valueSum() == 21){
            return true;
        }else{
            return false;
        }
    }

    public void printHand(){
        System.out.println(this.name + " Votre main est :");
        System.out.println(this.hand + " Estimé à : " + this.hand.valueSum());
    }


}
