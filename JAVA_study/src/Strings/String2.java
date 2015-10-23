package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class String2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите текст на английском языке: ");
		String text = reader.readLine();
		char[] textArray = text.toCharArray();
		int[] newText = new int[textArray.length];
		
		for (int i=0; i<textArray.length; i++){
			if (textArray[i] != ' ') {
				newText[i]=(int)textArray[i]-96;
			}
			else {
			 newText[i]=0;
			}
		}
		System.out.println("");
		for (char i : textArray){
			if (i != ' ') {
			System.out.print(i+"  ");	
			}
		}	
		System.out.println("");
		for (int i : newText){	
			if (i!=0){
			System.out.print(i+"  ");	
				
			}
			
		}
		
		}
	}
			
		
		
		