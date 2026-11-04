package weekly_Assignments;

public class Week4_MoveZeros {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 5, 0, 3, 8, 0, 2, 9 };
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}
		while (index < arr.length) {
			arr[index] = 0;
			index++;
		}
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}