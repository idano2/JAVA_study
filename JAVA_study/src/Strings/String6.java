package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class String6 {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите 1-ую строку: ");
		String text = reader.readLine();
		System.out.println("Введите 2-ую строку: ");
		String text2 = reader.readLine();
		
		MyMethod (text, text2);
	
	}		
		public static void MyMethod (String a, String b){
					
		char[] textArray2 = b.toCharArray();		
		char [] newArray = new char [textArray2.length];	
			for (int i=textArray2.length-1; i>=0; i--) {
				newArray[Math.abs(i-textArray2.length)-1] = textArray2[i];
			}
			String textNew = String.valueOf(newArray);
		
		if (a.equals(textNew)){
			System.out.println("Строка 2 является перестановкой строки 1");
		}	else{
			System.out.println("Строка 2 не является перестановкой строки 1");
		}	
	}
}		
		
		
		
		
		