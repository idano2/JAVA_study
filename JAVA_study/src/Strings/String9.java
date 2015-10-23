package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите строку1: ");
		String text = reader.readLine();
		System.out.println("Введите строку2: ");
		String text2 = reader.readLine();
		
		
		isSubstring (text, text2);
	
	}		
		public static void isSubstring (String a, String b){
		
			StringBuffer s_buffer = new StringBuffer(a.subSequence(0, a.length()));	
			StringBuffer s_buffer2 = new StringBuffer(b.subSequence(0, b.length()));
			String temp;
			
		for (int i=0; i<a.length(); i++){
			
			temp = s_buffer.substring(0,1);
			s_buffer.deleteCharAt(0);
			s_buffer.append(temp);
			if ((s_buffer2.toString()).equals(s_buffer.toString())){
				System.out.println("Строка 1 является подстрокой строки 2");
				return;
			}
					
		}
			System.out.println("Строка 1 не является подстрокой строки 2");	
		}
		
}
			
			
			
		
		