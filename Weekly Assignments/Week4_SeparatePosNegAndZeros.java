package weekly_Assignments;
public class Week4_SeparatePosNegAndZeros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -4, 7, 0, -2, 9, 0, -8, 5 };
		int res[] = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				res[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				res[index] = arr[i];
				index++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				res[index] = arr[i];
				index++;
			}
		}
		System.out.println("The required sorted array is: ");
		for (int x : res) {
			System.out.print(x + " ");
		}
	}
}