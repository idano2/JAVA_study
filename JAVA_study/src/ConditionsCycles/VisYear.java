package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VisYear {

		public static void main(String[] args) throws Exception {
			System.out.print("Введите год: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        int a = Integer.parseInt(reader.readLine());
	       	if ((a % 4 == 0 && a % 100 != 0) ||  a % 400 == 0 ) {
	        	System.out.print("Введенный год - високосный");
	        }
	        else {
	        	System.out.print("Введенный год - невисокосный");
	        }
		}
	}
