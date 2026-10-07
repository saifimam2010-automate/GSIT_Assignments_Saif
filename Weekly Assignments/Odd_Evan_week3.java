package weekly_Assignments;
public class Odd_Evan_week3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Question 4 — Even and Odd Numbers
		Write a Java program to print all even numbers and odd numbers between 1 and 20 using a loop.
		Expected Output:
		Even numbers:
		2 4 6 8 10 12 14 16 18 20
		Odd numbers:
		1 3 5 7 9 11 13 15 17 19
		*/
		int num = 20;
		System.out.println("Even Numbers: ");
		for(int i=1; i<=num; i++) {
			if(i>0 && i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("Odd Numbers: ");
		for(int i =1; i<=num;i++) {
			if(i%2 !=0) {
				
				System.out.print(i+" ");
			}
		}
	}
}