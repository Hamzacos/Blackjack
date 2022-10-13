package com.example;

import java.util.ArrayList;
import java.util.Random;

public class listCard {
    
    private ArrayList<Card> listCard;

    public listCard(){
        listCard = new ArrayList<Card>();
    }


    public listCard(boolean makeList){
        listCard = new ArrayList<Card>();
        if(makeList){
            for(type type : type.values()){
                for(Number num : Number.values()){
                    listCard.add(new Card(type, num));
                }
            }
        }
    }

    public void addCard(Card card){
        listCard.add(card);
    }

    // public void MakelistCard(Card make){
    //   listCard = new ArrayList<Card>();
    //   for(type type : type.values()){
    //     for(Number num : Number.values()){
    //         listCard.add(new Card(type, num));
    //         int p = listCard.indexOf(make);
    //        listCard.stream().filter(c -> listCard.indexOf(c) > p).collect(Collectors.toList());
    // }
    // }
// }
            public  ArrayList<Card> extraire_ieme_carte(ArrayList<Card> list,int n){
                    ArrayList<Card> simp = new ArrayList<>();
                    simp.add(list.get(n));
                    list.remove(n);
                    simp.addAll(list);
                    list = simp;
                    return list;
            }

            public ArrayList<Card> tirer_une_carte(ArrayList<Card> list){

                Random random =new Random();
                int randomIndex=0;
                randomIndex=random.nextInt((list.size()-1)+1);
                return extraire_ieme_carte(list, randomIndex);
            }


            public void melanger_jeu_cartes(){

                ArrayList<Card> n;
                ArrayList<Card> temp= new ArrayList<>();
                for(int i=0;i<52;i++){
                    n=tirer_une_carte(this.listCard);
                    temp.add(n.get(0));
                }
                this.listCard=temp;
            }


            public Card takeCard(){

                Card taken = new Card(listCard.get(0));
                listCard.remove(0);
                return taken;
            }

            public String toString(){
                String sort = "";
                for(Card  card : listCard){
                    sort += card;
                    sort += "\n";
                }
                return sort;
            }
}
