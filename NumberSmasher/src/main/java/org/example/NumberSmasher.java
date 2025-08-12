package org.example;
import java.util.*;

public class NumberSmasher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mystery = new String();
        {
            String code = "";
            Random rand = new Random();

            while (code.length() < 4) {
                int digit = rand.nextInt(10); // picks a number between 0 and 9

                // Only add the digit if it's not already in the code (to avoid duplicates)
                if (!code.contains(String.valueOf(digit))) {
                    code += digit;
                }
            }
            mystery += code;
        }
        int maxGuesses = 10;
        String guess = new String();

        System.out.println("*******************************************************************************************");
        System.out.println("**************************** Welcome to Number Smasher ************************************");
        System.out.println("****** I've thought of a 4-digit code with unique numbers (0-9). You have 10 guesses. *****");
        System.out.println("*******************************************************************************************");

        for (int i = 0 ; i < maxGuesses ; i++ ) {
            int k = i+1;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ You are on turn: " + k + " ~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Enter your four digit guess (e.g. 1234): " );
            guess = scanner.nextLine();
            int smash = 0;
            int hit = 0;
            if (guess.equals(mystery)) {
                System.out.println("Congratulations! You have guessed the correct number! You Win!");
                break;
            }
            if (!guess.equals(mystery)) {
                for (int j = 0; j < mystery.length() ; j++) {
                    char[] mysteryChar = mystery.toCharArray();
                    char[] guessChar = guess.toCharArray();
                    if (mysteryChar[j] == guessChar[j]){
                        smash++;
                    }
                    else {
                        for (char num : mysteryChar) {
                            if (num == guessChar[j]) {
                                hit++;
                            }
                        }
                    }
                }
                System.out.println("You have: "+ smash + " smashes");
                System.out.println("You have: "+ hit + " hits");
            }
        }
        if (!guess.equals(mystery)){
            System.out.println("You lose! Try again!");
        }
    }
}
