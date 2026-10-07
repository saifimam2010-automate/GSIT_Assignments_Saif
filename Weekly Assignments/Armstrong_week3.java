package weekly_Assignments;
public class Armstrong_week3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Question 3 — Armstrong Number
		Write a Java program to check whether a number is an Armstrong number using loops.
		Input:
		153
		Expected Output:
		153 is an Armstrong number
		*/
		int num = 153;
		int oNum = num;
		int armNum = 0;
		for(; num>0;) {
			int lastDig = num%10;
			int cube = lastDig*lastDig*lastDig;
			armNum = armNum + cube;
			num = num/10;
		}
		System.out.println("Original num is: "+oNum);
		System.out.println("Armstrong result is: "+ armNum);
		if(oNum == armNum)
			System.out.println("num is armstrong");
		else
			System.out.println("Not armstrong");
	}
}