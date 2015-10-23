package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите текст: ");
		String text = reader.readLine();
		System.out.println("Введите номер буквы для замены: ");
		int numberLetter = Integer.parseInt(reader.readLine());
		System.out.println("Введите символ для замены: ");
		char[] letter = reader.readLine().toCharArray();
		int k = 0;
		char[] textArray = text.toCharArray();
		for (int i=0; i<textArray.length; i++){
			if (textArray[i] != ' '){
				k++;
			}
				if (textArray[i]==' '){
				k=0;
			}
				if (k==numberLetter) {
				textArray[i]=letter[0];
			}
		
		} 
		String text2 = new String(textArray);
		
		
		System.out.println("Откорректированный текст: "+text2);
		
	}

}
