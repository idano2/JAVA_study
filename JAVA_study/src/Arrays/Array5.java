package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	int[] myArray = new int[15];
		
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Введите 15 чисел, после каждого числа нажмите Ввод");
	for (int i=0; i<15; i++){
		myArray[i]=Integer.parseInt(reader.readLine());
	}
	int min = myArray[0];
	int index = 0;
	for (int i=0; i<15; i++)
	{
		if (min>myArray[i]){
		min=myArray[i];
		index = i;
		}
	}
	System.out.println("Минимальное значение в массиве = "+min+" с индексом "+index);
	}
}
