package com.github.zipcodewilmington;
// James Heller

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    String[] words = {"car", "cat", "code", "bar", "bed", "dead", "home"};

    public static void main(String[] args){
        Wordguess game = new Wordguess();
        game.runGame();
    }

public static String randomword(){
        int num = (int) (Math.random() * words.length);
        return words[num];
}

// while number of guesses is less than word length keep playing while
// Game start once word picked print "_" equal to word length
// as char scanned equal char(#) replace in ____
// as char wrong +1 on guesses
// report a win statement if correct guesses equal word length
// report loss if guesses = word length
// loss and win end in request play again