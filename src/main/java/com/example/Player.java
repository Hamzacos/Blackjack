package com.example;

import java.util.Scanner;

public class Player extends Person {
    Scanner input = new Scanner(System.in);

    public Player(){
        super.setName("Hamza");
    }
    

    public void Decsion(listCard list, listCard DD){
        int decision = 0;
        boolean getNum = true;

        while(getNum){

            try{
                System.out.println("souhaitez-vous: 1-Tirer ou 2-Rester");
                decision = input.nextInt();
                getNum = false;

            }
            catch(Exception e){
                System.out.println("Invalid");
                input.next();
            }
        }

        if(decision ==1){
            this.hit(list,DD);
            if(this.getHand().valueSum() > 20){
                return;
            }else{
                this.Decsion(list, DD);
            }
        }else{
            System.out.println("vous reste");
        }
    }
}
