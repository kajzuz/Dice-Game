package com.kajsa.demo;

import java.util.Random;
import java.util.Scanner;

public class Dice { // Dice class

    public boolean amountOfDices() {

        // Instantiate scanner, random and as well player objects
        Scanner myScanner = new Scanner(System.in);
        Random inputRandom = new Random();

        Player player1 = new Player();
        Player player2 = new Player();

        // Declaring two variables
        String playerOneName;
        String playerTwoName;


        int totalScorePl1 = 0;
        int rollDiceInput = 0;
        int totalScore = 0;
        int totalPl1 = 0;
        int amount = 0;
        int total = 0;
        int result = 0;
        boolean amountOfRounds = true;
        int j = 1;


        // Asking for input and storing it in the variables
        System.out.println("Enter amount of dices: ");
        int amountOfDices = myScanner.nextInt();
        System.out.println("Alright " + amountOfDices + " dices\n");

        System.out.println("Player 1 enter your name: ");
        playerOneName = myScanner.next();
        player1.setNames(playerOneName);

        System.out.println("Player 2 enter your name");
        playerTwoName = myScanner.next();
        player2.setNames(playerTwoName);

        System.out.println("\nOur players: \n" + playerOneName + "\n" + playerTwoName + "\n");


        System.out.println("\nThis game consists of 5 rounds\n------------------------------");
        do {
            System.out.println("\nRound: " + j + "\n----------"); // Let the user know which round it is
            if (j <= 5){ // Total of 5 rounds
                j++; // Increasing j for each round
                System.out.println("You guys want to roll " +  amountOfDices + " dices: ");
                rollDiceInput = amountOfDices;

                System.out.println(playerOneName + " you rolled: "); // First for loop for player 1
                for (int p = 0; p < rollDiceInput; p++){ // Looping the text same amount of times as the users input
                    totalScorePl1 += result;
                    result = inputRandom.nextInt(1, 7); // result gets the value of a random number between 1-6
                    totalPl1 += result; // Counts the total score
                    System.out.println(result); // printing out the amount of rolled dice
                }
                player1.setScore(totalPl1); // Saving the total score in player 1
                System.out.println(playerOneName + " your score is: " + totalPl1 + "\n");

                System.out.println(playerTwoName + " you rolled: "); // Second for loop for player 2
                for (int i = 0; i < rollDiceInput; i++) { // Looping the text same amount of times as the users input
                    totalScore += amount;
                    amount = inputRandom.nextInt(1, 7); // amount, gets the value of a random number between 1-6
                    total += amount; // This counts the total score
                    System.out.println(amount); // printing out the amount of rolled dice
                }
                player2.setScore(total); // Saving the total score in player 2
                System.out.println(playerTwoName + " your score is: " + total);


                if (j == 6){ // Make the do while loop stop looping when it has the value off 6
                    // Depending on witch player has the higher score, that player wins
                    amountOfRounds = false;
                    if (totalPl1 > total){
                        System.out.println("\n" + playerOneName + " YOU WIN!!!\n");
                    }
                    else if (total > totalPl1){
                        System.out.println("\n" + playerTwoName + " YOU WIN!!!\n");
                    }
                    else{
                        System.out.println("\nIt's a tie!\n"); // If both player has the same score
                    }
                }
            }else{
                amountOfRounds = false;
            }
        }while(amountOfRounds);

        return amountOfRounds; // returning the method to main were i "call" it
    }

}
