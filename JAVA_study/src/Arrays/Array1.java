package Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float[] myArray = {2.5f, 4.4f, 5.7f, 6.8f, 4.8f, 5.1f, 9.4f, 7.3f, 6.2f, 1.1f};
	float m = 0;
	for (int i=0; i<myArray.length; i++){
		m=m+myArray[i];
		System.out.print(myArray[i]+" | ");
	}
	System.out.println("");
	System.out.println("average value = "+m/myArray.length);
	}
}
