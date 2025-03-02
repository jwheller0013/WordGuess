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

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Hangman {

    public static void main(String[] args) {

        //        Wordguess game = new Wordguess();
        //        game.runGame();
        //    }
       Scanner input = new Scanner(System.in);

       String[] words = {"car", "cat", "code", "bar", "bed", "dead", "home"};

        boolean gameOn = true;
        while (gameOn) {
            System.out.println("Let's Play Wordguess"); //greet player
            int random = (Math.random() * words.length);
            char chosenWord[] = words[random].toCharArray(); //chosenWord should make array of word
            String[] dashes = new String[chosenWord.length];
            Arrays.fill(dashes, "_"); //makes _ for chosenWord length found by typing in intelliJ but unsure if should use

            int guesses = Array.getLength(chosenWord); //guesses should equal chosen word length but does it pull array length?
            int attempts = 0;
            boolean won = false; //should only run while not already won

            while (!won && attempts ! = guesses) { //run only while havent won or ran out of attempts
                System.out.println("Number of wrong attempts remaining: " + attempts);
                System.out.println(dashes);
                System.out.println("Enter a letter");
                input = scanner.nextLine.charAt(0); //Scan letter guessed

                for (int i = 0; i < chosenWord.length; i++) {
                    if (input == chosenWord[i]) {
                        dashes[i] = chosenWord[i];
                    } else attempts++; //keep increasing attempts so ends game if equals guesses
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



}

// while number of guesses is less than word length keep playing while
// Game start once word picked print "_" equal to word length
// as char scanned equal char(#) replace in ____
// as char wrong +1 on guesses
// report a win statement if correct guesses equal word length
// report loss if guesses = word length
// loss and win end in request play again