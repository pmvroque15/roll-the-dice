package com.pluralsight;

public class Dice {
    public int roll1;
    public int roll2;

    public int twoCounter;
    public int fourCounter;
    public int sixCounter;
    public int sevenCounter;

    int roll() {
        return (int) ((Math.random() * 6) + 1);
    }


    public Dice() {
        this.roll1 = roll1;
        this.roll2 = roll2;
        this.twoCounter = twoCounter;
        this.fourCounter = fourCounter;
        this.sixCounter = sixCounter;
        this.sevenCounter = sevenCounter;
    }

    static void main(String[] args) {

        //Instance of dice
        Dice dice = new Dice();

        //loops 100 times
        for (int i = 0; i < 100; i++) {
            dice.roll1 = dice.roll();
            dice.roll2 = dice.roll();
            int sumOfTwoRolls = (dice.roll1 + dice.roll2);
            System.out.print("Roll 1: " + dice.roll1 + " - " + dice.roll2 + " Sum: " + sumOfTwoRolls + "\n");

            //if the sum of roll1 and roll2 is 2, and if so, increment the twoCounter
            if (sumOfTwoRolls == 2) {
                dice.twoCounter++;
            } else if (sumOfTwoRolls == 4) {
                dice.fourCounter++;
            } else if (sumOfTwoRolls == 6) {
                dice.sixCounter++;
            } else if (sumOfTwoRolls == 7) {
                dice.sevenCounter++;
            }
        }
        System.out.printf("TwoCounter: %s\nFourCounter: %s\nSixCounter: %s\nSevenCounter: %s\n", dice.twoCounter, dice.fourCounter, dice.sixCounter, dice.sevenCounter);
    }
}
