package weekly_Assignments;
public class Week5_AllSubstrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Find All Substrings of a String
		Write a Java program to print all possible non-empty substrings of
		a given string.
		Example:
		Input: ABC
		Output:
		A
		AB
		ABC
		B
		BC
		C
		*/
		String str = "ABC";
		for(int i=0; i<str.length(); i++) {
			for(int j= i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
}