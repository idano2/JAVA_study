package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OptimWeigth {

		public static void main(String[] args) throws Exception {
			System.out.print("Введите свой вес: ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        int ves = Integer.parseInt(reader.readLine());
	        System.out.print("Введите свой рост: ");
	        int rost = Integer.parseInt(reader.readLine());
	        if (rost-100 > ves) {
	            	System.out.print("Вас надо поправиться");
	            }
	            else if (rost-100 < ves){
	            	System.out.print("Вам надо похудеть");
	            }
	            else {
	            	System.out.print("Ваш вес оптимален");
	            }
	}
		
}
