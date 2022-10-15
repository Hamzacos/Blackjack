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

    public void hit(listCard deck, listCard DD){
        if(!deck.hasCard()){
            deck.chargerListCard(DD);
        }
        this.hand.takeCard(deck);
        System.out.println(this.name + " prend une carte");
        this.printHand();
    }


    public void printHand(){
        System.out.print(this.name + " Votre main est :");
        System.out.println(this.hand + " le totale de votre main est: " + this.hand.valueSum());
    }


}
