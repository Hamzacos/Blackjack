package com.example;

public class Game {

    private int wins, lose , push;
    private listCard groupCard , DD; 
    private Dealer dealer;
    private Player player;
    
    
    public Game(){
        
        groupCard = new listCard(true);
        DD = new listCard();
        dealer = new Dealer();
        player = new Player();
        groupCard.melanger_jeu_cartes();
        startRound();
    }


    private void startRound() {

        dealer.getHand().takeCard(groupCard);
        dealer.getHand().takeCard(groupCard);

        player.getHand().takeCard(groupCard);
        player.getHand().takeCard(groupCard);
    }
}
