package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumRyada {

	public static void main(String[] args) throws Exception {
		System.out.print("Введите число ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int kolvo = Integer.parseInt(reader.readLine());
        double sum = 0;
        for (int i=1; i<=kolvo; i++) {
        	sum += 1.0/i;
        }
        System.out.println(sum);
        	}
     	}
