package weekly_Assignments;
public class Palindrome_week3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Write a Java program to check whether a given number is
		a palindrome using a loop.
		Input:
		1221
		Expected Output:
		1221 is a palindrome
		*/	
		int num = 1221;
		int orig = num;
		int rev =0;
		if(num>0) {
			for(;num>0;num=num/10) {
				int lastDig = num%10;
				rev = rev*10+lastDig;
			}
		}
		if(orig == rev) {
			System.out.println("Palindrome: "+ orig+" == "+rev);
		}
		else
			System.out.println("not palindrome: "+orig+" != "+ rev);
	}
}