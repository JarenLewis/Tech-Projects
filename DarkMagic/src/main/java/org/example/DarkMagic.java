package org.example;

import java.util.Random;
import java.util.Scanner;

public class DarkMagic {

    public static void main(String[] args) {

        String[] lines = {
                "Welcome Traveler.",
                "I can tell you have come from lands far away.",
                "I can sense you have many questions.",
                "Ask to your heart's content."
        };

        for (String printedLines : lines) {
            System.out.println(printedLines);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Death follows you. I can not help you.");
            }
        }

        Scanner input = new Scanner(System.in);

        while (true) {

            String questionString = input.nextLine();
            int randNumber = new Random().nextInt(5);

            if(questionString.equalsIgnoreCase("end")){
                System.out.println("It is becoming dark. Safe travels.");
                break;
            }

            if (randNumber == 0) {
                System.out.println("Yes");
            } else if (randNumber == 1) {
                System.out.println("No");
            } else if (randNumber == 2) {
                System.out.println("Cannot predict now");
            } else if (randNumber == 3) {
                System.out.println("Most likely");
            } else if (randNumber == 4) {
                System.out.println("Very doubtful");
            }

            System.out.println("What else is on your mind?");

        }

    }
};


