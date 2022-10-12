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

    // public void MakelistCard(Card make){
    //   listCard = new ArrayList<Card>();
    //   for(type type : type.values()){
    //     for(Number num : Number.values()){
    //         listCard.add(new Card(type, num));
    //         int p = listCard.indexOf(make);
    //        listCard.stream().filter(c -> listCard.indexOf(c) > p).collect(Collectors.toList());
    // }<
    // }
// }
                public  ArrayList extraire_ieme_carte(ArrayList list,int n){
                    ArrayList simp = new ArrayList<>();
                    simp.add(list.get(n));
                    list.remove(n);
                    simp.add(list);
                    list = simp;
                    return list;
                }

            public ArrayList tirer_une_carte(ArrayList list){

                Random random =new Random();
                int randomIndex=0;
                randomIndex=random.nextInt((list.size()-1)+1);
                return extraire_ieme_carte(list, randomIndex);
            }


            public void melanger_jeu_cartes(){

                ArrayList n;
                ArrayList temp= new ArrayList<>();
                for(int i=0;i<52;i++){
                    n=tirer_une_carte(this.listCard);
                    temp.add(n.get(0));
                }
                this.listCard=temp;
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
