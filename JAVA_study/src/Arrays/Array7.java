﻿package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Array7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int[] myArray = new int[10];
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите 10 чисел, после каждого числа нажмите Ввод");
		for (int i=0; i<10; i++){
			myArray[i]=Integer.parseInt(reader.readLine());
		}
		int sum = 0;
		for (int i : myArray)
		{
			if (i!=0){
			sum=sum+i;
			} else break;
		}
		System.out.println("Сумма элементов до первого нуля = "+sum);
		}
		}