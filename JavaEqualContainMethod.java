import java.util.Scanner;

public class JavaEqualContainMethod {
	public static void main (String[]args) throws InterruptedException {
		
		System.out.println("This quiz will test your knowledge on world capitals.");
		int questionsCorrect = 0;
		{ Thread.sleep(1000); }
		// Question 1
	try (Scanner in1 = new Scanner (System.in)) {
		String answer1;
		
		System.out.println("What is the capital of Taiwan?");
		answer1 = in1.nextLine();
		
		if (answer1.contentEquals("Taipei")) {
			System.out.println(answer1.concat(" is the correct response.")); 
			++ questionsCorrect;
		} else {
			System.out.println(answer1.concat(" is not the correct response.")); }
		
			{ Thread.sleep(1000); } 
		// Question 2
	try (Scanner in2 = new Scanner (System.in)) {
		String answer2;
		
		System.out.println("What is the capital of South Korea?");
		answer2 = in2.nextLine();
		
		if (answer2.contentEquals("Seoul")) {
			System.out.println(answer2.concat(" is the correct response.")); 
			++ questionsCorrect;
		} else { 
			System.out.println(answer2.concat(" is not the correct response.")); }
			
			{ Thread.sleep(1000); }
		//Question 3
	try (Scanner in3 = new Scanner (System.in)) {
		String answer3;
				
		System.out.println("What is the capital of Vietnam?");
		answer3 = in3.nextLine();
				
		if (answer3.contentEquals("Hanoi")) {
			System.out.println(answer3.concat(" is the correct response.")); 
			++ questionsCorrect;
		} else { 
			System.out.println(answer3.concat(" is not the correct response.")); }
					
				{ Thread.sleep(1000); }
		//Question 4
	try (Scanner in4 = new Scanner (System.in)) {
		String answer4;
		
		System.out.println("What are the two capitals of Bolivia?");
		answer4 = in4.nextLine();
		
		if (answer4.contains("Sucre") && answer4.contains("La Paz")) {
			System.out.println("Those are the correct responses.");
			++ questionsCorrect;
		} else {
			System.out.println("Those are the incorrect responses."); }
		
			{ Thread.sleep(1000); }
		// Question 5
	try (Scanner in5 = new Scanner (System.in)) {
			
		String answer5;
		System.out.println("What are the three capitals of South Africa, separated by commas?");
		answer5 = in5.nextLine();
		
		if (answer5.contains("Bloemfontein") && answer5.contains("Cape Town") && answer5.contains("Pretoria")) {
			System.out.println("Those are the correct responses.");
			++ questionsCorrect;
		} else {
			System.out.println("Those are the incorrect responses."); }
		// Conclude/Results
		System.out.println("You answered ".concat(Integer.toString(questionsCorrect)) + " out of 5 questions correctly.");
	}
					}			
				}
			}
		}
	}
}