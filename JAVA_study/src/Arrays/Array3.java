package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	int[] myArray1 = {2,5,6,7,8,4,3,6,7,8,6,4,3,5,9};
	int[] myArray2 = new int[15];
	int[] myArray3 = new int[15];
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Введите 15 чисел, после каждого числа нажмите ¬вод");
	for (int i=0; i<15; i++){
		myArray2[i]=Integer.parseInt(reader.readLine());
		myArray3[i]=(int)(Math.random()*10+1);
	}
		for (int i : myArray1){
		System.out.print(i+" ");	
		}
		System.out.println("");
		for (int i : myArray2){
		System.out.print(i+" ");	
		}
		System.out.println("");
		for (int i : myArray3){
		System.out.print(i+" ");	
		}
		System.out.println("");
	}

}
