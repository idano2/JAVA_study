package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class String7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите строку: ");
		String text = reader.readLine();
		
		MyMethod (text);
	
	}		
		public static void MyMethod (String a){
		char[] textArray2 = a.toCharArray();		
		
		StringBuffer arcText = new StringBuffer();
		int k=0;
		char temp = textArray2[0];
		for (int i=0; i<textArray2.length; i++) {
			for (int j=i; j<textArray2.length; j++) {
				k++;
				i++;
				if (temp != textArray2[i])break;
				}
			
			temp = textArray2[i];
			arcText.append(textArray2[i]);
			arcText.append(k);
			k=1;
			
		}
			System.out.println(arcText);
	}
}		