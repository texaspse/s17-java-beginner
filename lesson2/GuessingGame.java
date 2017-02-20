package lesson2;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the number!");

        int secret_number = (int)(Math.random() * 100 + 1);
        
        while(true) {
            System.out.println("Please input your guess.");

            int guess = input.nextInt();

            System.out.printf("You guessed: %d", guess);

            if(guess < secret_number) {
                System.out.println("Too small!");
            } 
            else if(guess > secret_number) {
                System.out.println("Too big!");
            }
            else {
                System.out.println("You win!");
                break;
            }
        }
    }
}