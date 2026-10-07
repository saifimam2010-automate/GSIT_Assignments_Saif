package weekly_Assignments;
public class Sum_Of_Evenweek3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Write a Java program to find the sum of all even numbers 
		between 1 and 50 using a loop.
		Expected Output:
		Sum of even numbers = 650
		*/
		int num =50;
		int sum = 0;

		for(int i=1; i<=num;i++) {
				if(i%2==0) {
					sum = sum+i;
				}
		}
		System.out.println("Sum of even numbers: "+sum);
	}
}