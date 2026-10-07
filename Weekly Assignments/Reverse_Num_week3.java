package weekly_Assignments;
public class Reverse_Num_week3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Java Coding Assignment: Loops – Assignment 3
		Question 1 — Reverse a Number
		Write a Java program to reverse a given number using a loop.
		Input:
		12345
		Expected Output:
		54321
		*/	
		int num = 12345;
		int oNum = num;
		int rev =0;
		for(;num>0;) {
			int lastDig = num % 10;
			rev = rev*10+lastDig;
			num = num/10;
		}
		System.out.println("The given num is: "+ oNum);
		System.out.println("The reverse number is: "+ rev);
	}
}