package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DenNedeli {

	public static void main(String[] args)throws Exception {
		System.out.print("Введите номер для недели: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        if (day<1 || day>7) {
        	System.out.print("Вы ввели не корректную информацию");
        } 
        else {
        	switch(day) {
        		case 1: System.out.println("Понедельник"); break;
        		case 2: System.out.println("Вторник"); break;
        		case 3: System.out.println("Среда"); break;
        		case 4: System.out.println("Четверг"); break;
        		case 5: System.out.println("Пятница"); break;
        		case 6: System.out.println("Суббота"); break;
        		case 7: System.out.println("Воскресенье"); break;
        	}
     	}
	}
}
