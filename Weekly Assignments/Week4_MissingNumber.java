package weekly_Assignments;
public class Week4_MissingNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
		int n = 10;
		int expSum =0;
		int actSum =0;
		for(int i=1; i<=n; i++) {
			expSum = expSum+i;
		}
		for(int i=0; i<arr.length; i++) {
			actSum = actSum+arr[i];
		}
		int missingNum = expSum - actSum;
		System.out.println("Missing number is: "+missingNum);
	}
}