package weekly_Assignments;
public class Week5_ReplaceCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Replace a Character in a String
		Write a Java program to replace all occurrences of a particular 
		character with another character without usingthe replace() method.
		Example:
		Input:
		String: banana
		Old Character: a
		New Character: o
		Output: bonono
		*/
		String str = "bananana";
		String res = "";
		char oldC = 'a';
		char newC = 'o';
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == oldC) {
				res = res + newC;
			}
			else
				res = res + ch;
		}
		System.out.println("Original String: " + str);
		System.out.println("The replaced string is: "+res);
	}
}