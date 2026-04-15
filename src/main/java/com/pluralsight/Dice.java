package com.pluralsight;

public class Dice {
    static void main(String[] args) {
        //Declare variables
        int roll1 = 0;
        int roll2 = 0;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;
        //Instance of dice
        Dice dice = new Dice();

        //loops 100 times
        for (int i = 0; i < 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sumOfTwoRolls = (roll1 + roll2);
            System.out.print("Roll 1: " + roll1 + " - " + roll2 + " Sum: " + sumOfTwoRolls + "\n");

            //if the sum of roll1 and roll2 is 2, and if so, increment the twoCounter
            if (sumOfTwoRolls == 2) {
                twoCounter++;
            } else if (sumOfTwoRolls == 4) {
                fourCounter++;
            } else if (sumOfTwoRolls == 6) {
                sixCounter++;
            } else if (sumOfTwoRolls == 7) {
                sevenCounter++;
            }
        }
        System.out.printf("TwoCounter: %s\nFourCounter: %s\nSixCounter: %s\nSevenCounter: %s\n", twoCounter,fourCounter,sixCounter,sevenCounter);
    }
    //method roll()
    static int roll() {
        return (int) ((Math.random() * 6) + 1);
    }
}
