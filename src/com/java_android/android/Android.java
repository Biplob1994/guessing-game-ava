package com.java_android.android;

import java.util.Random;
import java.util.Scanner;

public class Android {
    public static void main(String[] args) {
        System.out.println("welcome to our wonderland");
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello dear "+ name);

        System.out.println("Shall we start");
        System.out.println("\t yes");
        System.out.println("\t no");

        String answer = scanner.next();

        while(!(answer.equals("yes"))){
            System.out.println("Shall we start");
            System.out.println("\t1. yes");
            System.out.println("\t1. no");

             answer = scanner.next();
        }
        System.out.println("Let's get started");
        Random random = new Random();
        int number = random.nextInt(20);
        System.out.println("enter your guessing number");
        int guessNumber =  scanner.nextInt();

        int count = 0;
        boolean hasWon = false;
        boolean guessStop = false;
        while(!guessStop){
            count++;
            if(count<5){
                if(guessNumber == number){
                    hasWon = true;
                    guessStop = true;
                }else if(guessNumber>number){
                    System.out.println("Your nubmer is greater than the number, try again");
                     guessNumber =  scanner.nextInt();
                }
                else{
                    System.out.println("Your number is less than the number,try again");
                     guessNumber =  scanner.nextInt();
                }
            }else{
                guessStop = true;
            }
        }
        if(hasWon){
            System.out.println("congratulations! your timestamp is " + count);

        }else {
            System.out.println("game over! you have tried "+ count + " times");

    }
}
