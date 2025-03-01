package com.github.zipcodewilmington;
// James Heller
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

public class Hangman {
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

    public static void main(String[] args){
        String[] words = {"car", "cat", "code", "bar", "bed", "dead", "home"};

//        Wordguess game = new Wordguess();
//        game.runGame();
//    }

        String chosenWord[] = words[(Math.random() * words.length)]; //chosenWord should become one of the words
        String[] dashes = new String[chosenWord.length];
        Arrays.fill(dashes, "_"); //makes _ for chosenWord length
        char [] wordArray = chosenWord.toCharArray ();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        input = scanner.next(); //Scan letter guessed

        int guesses = 0;

        while(Arrays.toString(dashes).contains("_")) {


            guesses
        }



}

// while number of guesses is less than word length keep playing while
// Game start once word picked print "_" equal to word length
// as char scanned equal char(#) replace in ____
// as char wrong +1 on guesses
// report a win statement if correct guesses equal word length
// report loss if guesses = word length
// loss and win end in request play again