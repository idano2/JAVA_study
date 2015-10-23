package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

	int[] myArray = new int[15];
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Введите 15 чисел, после каждого числа нажмите Ввод");
	for (int i=0; i<15; i++){
		myArray[i]=Integer.parseInt(reader.readLine());
	}
	int max = myArray[0];
	int index = 0;
	for (int i=0; i<15; i++)
	{
		if (max<myArray[i]){
		max=myArray[i];
		index = i;
		}
	}
	System.out.println("Максимальное значение в массиве = "+max+" с индексом "+index);
	}
}
