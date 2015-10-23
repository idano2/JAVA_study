package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChastnoeTest {

	public static void main(String[] args) throws Exception {
		System.out.print("Введите первое число: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Integer.parseInt(reader.readLine());
        System.out.print("Введите второе число: ");
        double b = Integer.parseInt(reader.readLine());
       
        System.out.print("Частное от деления первого введенного числа на второе составляет: "+a/b);
   	}
}