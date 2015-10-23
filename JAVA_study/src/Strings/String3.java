package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class String3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите текст: ");
		String text = reader.readLine();
		StringBuffer newText = new StringBuffer();
				
		char[] textArray = text.toCharArray();
		for (char i:textArray){
			if (i>='a'&i<='z' | i>='A'&i<='Z' | i>='А'&i<='Я' | i>='а'&i<='я' | i=='ё'| i=='Ё' |i==' '){
			newText.append(i);	
			}
		}
			
		System.out.println(newText);
		}
	}