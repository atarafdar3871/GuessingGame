import java.util.Scanner;
import java.lang.Math;
//import java.util.MismatchException;

public class GuessingGame {
	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		String s = input.next();
		System.out.println("Hi " + s + ", How old are you?");
		String t = input.next();
		System.out.println(t + " years-old!");
		input.close();
		*/
		
		int guess = 0;
		int rngNum = (int)(Math.random()*11 - 1);
		Scanner input = new Scanner(System.in);
		System.out.println("What number am I thinking 1-10?");
		guess = input.nextInt();
		while (guess != rngNum) {
			if (guess < rngNum) {
				System.out.println("Too low");
			}
			if (guess > rngNum) {
				System.out.println("Too high");
			}
			
			guess = input.nextInt();
		}
		System.out.println("cool");
		input.close();
	}
}
