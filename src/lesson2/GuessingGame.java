package lesson2;
//Remove the above line if it errors i.e. you didn't put this in a package

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the number!");

        int secret_number = (int)(Math.random() * 100 + 1);
        
        while(true) {
            System.out.println("Please input your guess.");

            int guess = input.nextInt();

            System.out.printf("You guessed: %d%n", guess);

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
