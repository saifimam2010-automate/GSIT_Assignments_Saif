package weekly_Assignments;
public class Week_5_LongestWordStr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Find the Longest Word
		Write a Java program to find the longest word in a given sentence.
		Example:
		Input: Java programming is interesting
		Output: programming
		*/
		String str = "Java programming is interesting";
		String longest = "";
		String []words = str.split(" ");
		for(int i=0; i<words.length; i++) {
			if(words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		System.out.println("The longest word in the string is: "+longest);
	}
}