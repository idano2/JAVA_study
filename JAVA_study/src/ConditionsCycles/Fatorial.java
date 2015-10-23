package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fatorial {

	public static void main(String[] args) throws Exception {
		System.out.print("Введите число ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int kolvo = Integer.parseInt(reader.readLine());
        long factorial = 1;
        for (int i=1; i<=kolvo; i++) {
        	factorial *= i;
        }
        System.out.println(factorial);
        	}
     	}