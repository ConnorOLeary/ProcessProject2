package sample.controller;
import java.util.*;
import sample.model.PlayDohCircle;
import sample.model.PlayDohString;

public class SampleController {
	
	public SampleController() {
		
	}
	public void start() {
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(7);
		
		PlayDohString myString = new PlayDohString(1);
		PlayDohString bigString = new PlayDohString(9);
		
		System.out.println("I'm playing with doh");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle: " + secondCircle);
		System.out.println("This is my third circle: " + thirdCircle);
		
		System.out.println("I also made a small string:  " + myString);
		System.out.println("and a big string: " + bigString);
		
	}
	
	private void scanner() {
		Scanner firstScanner; //Declares a Scanner object.
		firstScanner = new Scanner(System.in); //Instanciates a Scanner
		System.out.println("");
		String answer = firstScanner.nextLine();
		
		PlayDohCircle changeCircle = new PlayDohCircle();
		System.out.println("I'm gonna make a circle how big should I make it?");
		int mySize = firstScanner.nextInt();
		changeCircle.setSize(mySize);
		System.out.println("Look at this circle");
		System.out.println(changeCircle);
	}
}
