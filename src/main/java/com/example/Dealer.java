package com.example;

public class Dealer extends Person {
    


    public Dealer(){
        super.setName("Dealer");
    }

    public void fristhandDealer(){
        System.out.println("La main du croupier ressemble à ceci :");
        System.out.println(super.getHand().getCrad(0));
        System.out.println("le deuxieme carte est cachee");
    }

    
}
