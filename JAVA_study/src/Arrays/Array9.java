package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Array9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int[] myArray = new int[10];
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите 10 чисел, после каждого числа нажмите Ввод");
		for (int i=0; i<10; i++){
			myArray[i]=Integer.parseInt(reader.readLine());
		}
		System.out.print("Отсортированный массив: ");
		for (int i=0; i<10; i++){ 
			for (int j=0; j<9; j++) {
				if (myArray[j]==0){
					int temp = myArray[j+1];
					myArray[j+1]=myArray[j];
					myArray[j]=temp;
				}
			}
		}
		for (int i : myArray)
		System.out.print(" "+i);
		}
		}