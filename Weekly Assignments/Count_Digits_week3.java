package weekly_Assignments;

public class Count_Digits_week3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Question 2 — Count Digits
		Write a Java program to count the number of digits in a given number using a while loop.
		Input:
		987654
		Expected Output:
		Number of digits = 6
		*/		
		int num = 987654;
		int countOfDigits=0;
		for(; num>0;) {
			countOfDigits++;
			num = num/10;
		}
		System.out.println(countOfDigits);
	}
}