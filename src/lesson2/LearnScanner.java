package lesson2;

import java.util.Scanner;

public class LearnScanner {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int grade = keyboard.nextInt();

		if(grade >= 90) {
			System.out.println("A");
		} else if(grade >= 80) {
			System.out.println("B");
		} else if(grade >= 70){
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}
}
