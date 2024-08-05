package com.swabhav.assignments.controlstructure;

import java.util.Random;
import java.util.Scanner;

public class WordGuesserGame {
	
	public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        String[] myArray = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};  
        String wordToGuess = myArray[random.nextInt(myArray.length)];  
  
//        System.out.println(wordToGuess);  
       
     
        int wordLength = wordToGuess.length();
        int lives = wordLength * 3; 
        
        
        char[] guessedWord = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            guessedWord[i] = '_';
        }
        
       
        boolean wordGuessed = false;
        while (!wordGuessed && lives > 0) {
            System.out.print("Word to guess: ");
            for (char c : guessedWord) {
                System.out.print(c + " ");
            }
            System.out.println("\nLives left: " + lives);
            
           
            System.out.print("Enter a letter or the whole word guess: ");
            String guess = scanner.nextLine().toLowerCase();
            
            if (guess.length() == 1) { 
                boolean correctGuess = false;
                for (int i = 0; i < wordLength; i++) {
                    if (wordToGuess.charAt(i) == guess.charAt(0)) {
                        guessedWord[i] = guess.charAt(0);
                        correctGuess = true;
                    }
                }
                if (!correctGuess) {
                    lives--;
                    System.out.println("Incorrect guess. You lost one life.");
                }
            } else if (guess.equals(wordToGuess)) { 
                wordGuessed = true;
            } else {
                System.out.println("Incorrect guess.");
                lives--;
            }
            
            
            if (String.valueOf(guessedWord).equals(wordToGuess)) {
                wordGuessed = true;
            }
        }
        
       
        if (wordGuessed) {
            System.out.println("Congratulations! You guessed the word correctly: " + wordToGuess);
        } else {
            System.out.println("Game over. The word was: " + wordToGuess);
        }
        
       
    }

}
