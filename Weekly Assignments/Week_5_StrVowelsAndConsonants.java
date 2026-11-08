package weekly_Assignments;
public class Week_5_StrVowelsAndConsonants {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Count Vowels and Consonants Write a Java program to count
		  the total number of vowels and consonants in a given string.
		  Example: Input: Programming 
		  Output : Vowels: 3 Consonants: 8
		 */
		String str = "Programming";
		str = str.toLowerCase();
		int vowels = 0;
		int consos = 0;
		int lenght = str.length();
		for(int i=0; i<=lenght-1;i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' ||
					c == 'o' || c == 'u') {
				vowels++;
			}
			else if(c >= 'a' && c <= 'z')
				consos++;
		}
		System.out.println("Total vowels are: "+vowels);
		System.out.println("Total consonants are: "+consos);
	}
}