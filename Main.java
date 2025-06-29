package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
    public static void main(String[] args) {

        int HEADS = 0;
        int TAILS = 1;
        Random coinFace = new Random();
        Scanner scanner = new Scanner(System.in);
        int face = coinFace.nextInt(2);


        System.out.print("Choose Heads or Tails: ");
        String coinChoice = scanner.nextLine();
        System.out.println("Your choice is: " + coinChoice);
        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("*************************");

        if (face == 1) {
            System.out.print("It was: Tails");
        } else {
            System.out.println("It was: Heads");
        }
    }
}



