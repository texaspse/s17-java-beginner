package lesson2;
//Remove the above line if it errors i.e. you didn't put this in a package

// import Scanner so we can read from the keyboard
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
    	// Create a new instance of the Scanner class and name it input
    	// System.in is the name for the keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the number!");

        // Create a number from 1 to 100
        int secret_number = (int)(Math.random() * 100 + 1);
        
        // Loop forever
        while(true) {
            System.out.println("Please input your guess.");

            // Read in a integer
            int guess = input.nextInt();

            // Print their guess. %d means print an integer.
            // %n means print newline. We pass guess as the second parameter
            // so it can print it. More over this next lesson.
            System.out.printf("You guessed: %d%n", guess);

            // Check if their guess is smaller
            if(guess < secret_number) {
                System.out.println("Too small!");
            } 
            // Check if their guess is bigger
            else if(guess > secret_number) {
                System.out.println("Too big!");
            }
            // It's neither so they guessed it correctly 
            else {
                System.out.println("You win!");
                break;
            }
        }
    }
}
