package com.pluralsight;

public class Dice {
    static void main(String[] args) {
        System.out.print(roll(1,6));
        //Declare variables
        int roll1 = 0;
        int roll2 = 0;

        int counterNumber2 = 0;
        int counterNumber4 = 0;
        int counterNumber6 = 0;
        int counterNumber7 = 0;
        //Instance of dice
        Dice dice = new Dice();

        //loops 100 times
        for (int i = 0; i < 100; i++) {
            roll1 = roll();
            roll2 = roll();
        }
    }
    //method roll()
    static int roll() {
        return (int) ((Math.random() * 6) + 1);
    }
}
