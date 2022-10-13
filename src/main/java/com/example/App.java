package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        System.out.println("Welecom To The Game");
        Game blackJack = new Game();
        // System.out.println(Number.QUEEN + " Has value of " + Number.QUEEN.numberValue);
        // Card test = new Card(type.carreau, Number.JACK);
        // System.out.println(test);


        listCard testofList = new listCard(true);
      


        

        // testofList.melanger_jeu_cartes();
        // System.out.println(testofList);


    //    listCard deck = new listCard(true);
    //    Hand main = new Hand();
    //    main.takeCard(deck);
    //    System.out.println("l'element :");
    //    System.out.println(main);
    //    System.out.println("apres :");
    //    System.out.println(deck);


    // listCard testDeck = new listCard();
    // testDeck.addCard(new Card(type.cœur, Number.ACE));
    // testDeck.addCard(new Card(type.cœur, Number.KING));
    // Hand testHand = new Hand();
    // testHand.takeCard(testDeck);
    // testHand.takeCard(testDeck);
    // System.out.println("The value of this hand is: " + testHand.valueSum());


    }
}
