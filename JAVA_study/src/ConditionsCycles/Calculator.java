package ConditionsCycles;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Вас приветствует программа калькулятор");
		System.out.println("Если Вы желаете делить нажмите 1");
		System.out.println("Если Вы желаете отнять нажмите 2");
		System.out.println("Если Вы желаете выйти нажмите q");
		while (true)
		{
			String k = reader.readLine();
			if (k.equals("q")) {break;}
			else {
				int punkt = Integer.parseInt(k);
				if (punkt==1){
					System.out.print("Введите делимое: ");
					double delim = Integer.parseInt(reader.readLine());
					System.out.print("Введите делитель: ");
					double delit = Integer.parseInt(reader.readLine());
					System.out.println("Частное: "+delim/delit);
					System.out.println("Если Вы желаете делить нажмите 1");
					System.out.println("Если Вы желаете отнять нажмите 2");
					System.out.println("Если Вы желаете выйти нажмите q");
					}
				else {
					if (punkt==2){
					System.out.print("Введите число от которого следует отнять: ");
					double otn = Integer.parseInt(reader.readLine());
					System.out.print("Введите вычитаемое: ");
					double otnim = Integer.parseInt(reader.readLine());
					System.out.println("Разность: "+ (otn-otnim));
					System.out.println("Если Вы желаете делить нажмите 1");
					System.out.println("Если Вы желаете отнять нажмите 2");
					System.out.println("Если Вы желаете выйти нажмите q");
					}
										
				}
					
				}
		}
	
	}
	}
				
				
			