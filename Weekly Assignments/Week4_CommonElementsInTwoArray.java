package weekly_Assignments;
public class Week4_CommonElementsInTwoArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10, 20, 30, 40, 50};
	    int arr2[] = {30, 40, 60, 70, 50};
	    System.out.println("The common elements are: ");
	    
	    for(int i=0; i<arr1.length; i++) {
	    	for(int j=0; j<arr2.length; j++) {
	    		if(arr1[i] == arr2[j]) {
	    			System.out.print(arr1[i]+" ");
	    		}
	    	}
	    }
	}
}