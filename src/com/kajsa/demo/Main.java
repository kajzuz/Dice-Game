package com.kajsa.demo;

public class Main {
    public static void main(String[] args) {

        // Instantiate object
        Dice myAmountOfDices = new Dice();

        /*Using try catch, this makes sure that if wrong input from user is caught by the catch that prints out a
        message to the user that something went wrong. I did put the whole game inside the try because it
        covers the entire class.*/
        try{
            myAmountOfDices.amountOfDices();
        }catch (Exception e){
            System.out.println("Ooops something went wrong...");
        }
    }
}
