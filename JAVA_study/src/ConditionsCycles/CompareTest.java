package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CompareTest {

	public static void main(String[] args) throws Exception {
		System.out.print("Введите первое число: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(reader.readLine());
        if (a<b) {
        	System.out.print(a+" меньше "+b);
        }
        else if (a>b){
        	System.out.print(a+" больше "+b);
        }
        else {
        	System.out.print(a+" равно "+b);
        }
     }
}
