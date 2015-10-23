package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class string5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите текст: ");
		String text = reader.readLine();
		
		char[] textArray = text.toCharArray();
		
		int k = 0;
		
		for (int i=0; i<textArray.length; i++){
			char temp = textArray[i];
			for (int j=i; j<textArray.length-1; j++){
				if (temp==textArray[j+1]){
					k++;
				}
			}
			
			if (k>=1){
				System.out.println("Не все символы в строке встречаются один раз");
				System.exit(0);
			}	
		}		
	
		if (k==0){
			System.out.println("Все символы в строке встречаются один раз");
		}
			
		
		
	}
}