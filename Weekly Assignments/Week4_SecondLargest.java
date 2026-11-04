package weekly_Assignments;

public class Week4_SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Find the Second Largest Element
		Write a Java program to find the 
		**second largest distinct element** in an integer array.

		**Input:**
		`{12, 45, 7, 89, 34, 89, 56}`

		**Expected Output:**
		`Second largest element: 56`
		*/
		int arr[] = {12, 45, 7, 89, 34, 89, 56};
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> largest) {
				secLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] < largest && arr[i] > secLargest) {
				secLargest = arr[i];
			}
		}
		if(secLargest == Integer.MIN_VALUE)
			System.out.println("Distinct sc lar not exist");
		else
			System.out.println("Second largest is: "+secLargest);
	}

}
