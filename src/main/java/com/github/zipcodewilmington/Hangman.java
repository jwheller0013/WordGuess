package com.github.zipcodewilmington;
// James Heller

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {

    String[] words = {"car", "cat", "code", "bar", "bed", "dead", "home"};

    public static void main(String[] args) {

}
public static String randomword(){
        int num = (int) (Math.random() * words.length);
        return words[num];
}

}
