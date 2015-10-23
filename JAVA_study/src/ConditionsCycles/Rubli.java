package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rubli {

	public static void main(String[] args) throws Exception {
		System.out.print("Введите число от 1 до 999: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rubl = Integer.parseInt(reader.readLine());
        if (rubl<1 || rubl>999) {
        	System.out.print("Вы ввели не корректную информацию");
        } 
        else {
        	if (rubl > 4 && rubl < 20) {
        		System.out.print("Вы ввели "+rubl+" рублей");
        	}
        	else {
        		int ost = rubl % 10;
        		if (ost == 1) {
        			System.out.print("Вы ввели "+rubl+" рубль");
        			}
        		else if (ost == 2 || ost ==3 || ost ==4) {
        			System.out.print("Вы ввели "+rubl+" рубля");
        			}
        			else {System.out.print("Вы ввели "+rubl+" рублей");       				
        			}
        		}
        		}
          	}
       
        }
        
        
        
       
