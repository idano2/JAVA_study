package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataNedeli {

	public static void main(String[] args) throws Exception {
		System.out.print("Введите число от 1 до 31: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        System.out.print("Введите мес¤ц от 1 до 12: ");
        int month = Integer.parseInt(reader.readLine());
        System.out.print("Введите год от 1: ");
        int year = Integer.parseInt(reader.readLine());
        if (month == 11) {month = 1;} else
        if (month == 12) {month = 2;} else {
        	month = month - 2;
        }
        
        int result = (day+(1/5*(13*month-1))+year+year/4+(year/100)/4-2*year/100+777)&7;
        
          	switch(result) {
        		case 1: System.out.println("Понедельник"); break;
        		case 2: System.out.println("Вторник"); break;
        		case 3: System.out.println("Среда"); break;
        		case 4: System.out.println("Четверг"); break;
        		case 5: System.out.println("Пятница"); break;
        		case 6: System.out.println("Суббота"); break;
        		case 0: System.out.println("Воскресенье"); break;
        	}
     	}
}