package org.meicode.loops;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 5;
//        for(int i = 0; i < a; i++){
//            System.out.println(i);
//        }

//        while(a < 10){
//            a++;
//            if(a == 8){
//                continue; // go to next round of the while loop
//            }
//            System.out.println(a);
//
//        }

//        if we want to go into loop at least once, use do while
//        do {
//            System.out.println("Hello");
//        } while (a<5);

        // read user input
//        System.out.println("Please enter a number:");
//        Scanner scanner = new Scanner(System.in);
//        int answer = scanner.nextInt();
//        System.out.println("Answer was: "+answer);
//        System.out.println("Enter your name: ");
//        String name = scanner.next();
//        System.out.println("Hello "+name);

//        Random random = new Random();
//        int number = random.nextInt(20); // means this random number will be between 0 and 20
//        System.out.println("number: "+number);

        System.out.println("Do you want to play the game? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String reply = scanner.next();

        while(!reply.equals("yes")){
            System.out.println("Do you want to play the game? (yes/no)");
            reply = scanner.next();
        }
    // when user enters "yes" then we can start
        Random random = new Random();
        int target = random.nextInt(20);
        int count = 0;
        int guess = 0;
        while(count != 5){
            count++;
            System.out.println("Please enter your guess: ");
            guess = scanner.nextInt();
            if(guess == target) {
                System.out.println("Congrats. You have won in your "+count+"th try");
                break;
            } else if (guess > target){
                System.out.println("Please try guessing a smaller number");
            } else {
                System.out.println("Please try guessing a bigger number");
            }
        }

        if(guess != target){
            System.out.println("Sorry, you have lost. The correct number was "+target);
        }

        System.out.println("Game Over.");
    }
}
