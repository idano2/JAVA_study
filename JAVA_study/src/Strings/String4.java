package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//сделал только дл¤ русского алфавита и строчных букв

public class String4 {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Введите текст: ");
			StringBuffer text = new StringBuffer(reader.readLine());
			System.out.println("Введите длину слова: ");
			int word = Integer.parseInt(reader.readLine());
			StringBuffer newText = new StringBuffer();
			text.insert(0, ' ');
			String myText = text.toString();
			
			char[] textArray = myText.toCharArray();
				
			for (int i=1; i<textArray.length-word; i++){
				if (textArray[i]>='б'& textArray[i]<='ъ'& textArray[i]!='е'&textArray[i]!='и'
						&textArray[i]!='о' &textArray[i]!='у'&textArray[i]!='ы'
						& textArray[i+word]==' '&(textArray[i-1]==' '|textArray[i-1]=='~')){
					for (int j=i; j<i+word+1; j++) {
						textArray[j]='~'; //костылик						
					}
					i=i+word;
				}
				
			}		
			for (char i : textArray){
				if (i!='~'){
				newText.append(i);
				}
			}
						
			System.out.println(newText.toString().trim());
			}
		}
		