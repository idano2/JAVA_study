package Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] myArray = {3, 6, 56, 34, 45, 23, 99, 12, 67, 89};
	int min = myArray[0];
	int max = myArray[0];
	for (int f : myArray) {
		if (min > f) {
			min = f;
		} 
		if (max < f){
			max = f;
		}
	}
	
	System.out.println("min value = "+min);
	System.out.println("max value = "+max);
	
	}

}
