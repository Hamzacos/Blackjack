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

        System.out.println("Welecom To The Game");
        Game blackJack = new Game();
        System.out.println(Number.KING + " Has value of " + Number.KING.numberValue);

    }
}
