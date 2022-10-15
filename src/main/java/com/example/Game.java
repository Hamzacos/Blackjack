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

        if(wins>0 || lose>0 || push > 0){
            System.out.println();
            System.out.println("Starting Next Round... Wins: " + wins + " Losses: "+ lose+ " Pushes: "+push);
            dealer.getHand().discardHandToDeck(DD);
            player.getHand().discardHandToDeck(DD);
        }
        if(groupCard.cardsLeft() < 4){
            groupCard.chargerListCard(DD);
        }

        dealer.getHand().takeCard(groupCard);
        dealer.getHand().takeCard(groupCard);

        player.getHand().takeCard(groupCard);
        player.getHand().takeCard(groupCard);

        dealer.fristhandDealer();
        player.printHand();

        if(dealer.hasBlackJack()){
            dealer.printHand();
        if(player.hasBlackJack()){
            System.out.println("Vous avez les deux 21 -Egalite");
            push++;
            startRound();
        }else{
            System.out.println("le courpier a un blackJack vous avez perdu");
            dealer.printHand();
            lose++;
            startRound();
        }
        }
        if(player.hasBlackJack()){
            System.out.println("Vous avez un blackJack !! vous avez gange");
            wins++;
            startRound();
        }

        player.Decsion(groupCard, DD);

        if(player.getHand().valueSum() > 21){
            System.out.println("Vous avez une somme de carte superieur de 21 Vous avez perdu");
            lose++;
            startRound();
        }

        dealer.printHand();
        while(dealer.getHand().valueSum() < 17){
            dealer.hit(groupCard, DD);
        }

        if(dealer.getHand().valueSum() > 21){
            System.out.println("croupier dépasse");
            wins++;
        }
        else if(dealer.getHand().valueSum() > player.getHand().valueSum()){
            System.out.println("Vous avez perdu.");
            lose++;
        }
        else if(player.getHand().valueSum() > dealer.getHand().valueSum()){
            System.out.println("Vous avez gange.");
            wins++;
        }
        else{
            System.out.println("Egalite.");
        }

        startRound();
    }
}
