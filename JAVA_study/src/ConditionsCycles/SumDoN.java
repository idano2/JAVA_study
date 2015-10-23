package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumDoN {

	public static void main(String[] args) throws Exception {
		System.out.print("¬ведите число ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int kolvo = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (int i=1; i<=kolvo; i++) {
        	sum += i;
        }
        System.out.println(sum);
        	}
     	}