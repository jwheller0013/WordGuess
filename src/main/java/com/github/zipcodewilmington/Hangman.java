package com.github.zipcodewilmington;
// James Heller
import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author xt0fer
 * @version 1.0.02
 * @date 5/27/21 11:02 AM
 */

import java.util.Random;

public class Hangman {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //need to establish values outside of game
        Random random = new Random();
        //        Wordguess game = new Wordguess();
        //        game.runGame();
        //    }
       String[] words = {"car", "cat", "code", "bar", "bed", "dead", "home"};

        boolean gameOn = true;
        while (gameOn) {
            System.out.println("Let's Play Wordguess"); //greet player
            int randomNumber = (random.nextInt(words.length) - 1 ); //adjusted ensuring to add -1 so accounts for 0 array spot
            char chosenWord[] = words[randomNumber].toCharArray(); //chosenWord should make array of word
            int guesses = chosenWord.length;
            char playerGuesses[] = new char[chosenWord.length];

            for (int i=0; i < playerGuesses.length; i++) {
                playerGuesses[i] = '_';
            }


            boolean won = false; //should only run while not already won
            int attempts = 0;

            while (!won && attempts!=guesses) { //run only while havent won or ran out of attempts
                System.out.println("Number of wrong attempts remaining: " + (guesses - attempts));
                System.out.println(playerGuesses);
                System.out.println("Enter a letter");
                char letter = scanner.nextLine.charAt(0); //Scan letter guessed

                for (int i = 0; i < chosenWord.length; i++) {
                    if (chosenWord[i] == letter) {
                        playerGuesses[i] = letter; //if guessed correct changes '_' to letter
                    }
                    else attempts++; //keep increasing attempts so ends game if equals guesses
                }
                if (isSolved(playerGuesses)) {
                    won = true;
                    System.out.println("Congratulations");
                }
            }
            if(!won) {
                System.out.println("You are out of attempts.");
            }

            System.out.println("Would you like to try again? (yes/no) ");
            String choice = scanner.nextLine();
            if (choice.equals("no")) {
                gameOn = false;
            }
        }
        System.out.println ("Game Over.");
    }
    public static boolean isSolved(char[] array) { //this seems a better way to track if won instead of previous attempt
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "-") {
                return false;
            }
            return true;
        }
        }
    }


// while number of guesses is less than word length keep playing while
// Game start once word picked print "_" equal to word length
// as char scanned equal char(#) replace in ____
// as char wrong +1 on guesses
// report a win statement if correct guesses equal word length
// report loss if guesses = word length
// loss and win end in request play again