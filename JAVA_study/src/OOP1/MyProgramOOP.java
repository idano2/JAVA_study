package OOP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyProgramOOP {

	public static Car [] myCar;
	
	public static void main(String[] args) throws Exception {
		
		Car[] foundCar = null;
		myCar = buildCar();
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Введите а - если необходимо вывести список автомобилей заданной марки");
		System.out.println("Введите b - автомобилей заданной модели, которые эксплуатируются больше n лет");
		System.out.println("Введите c - список автомобилей заданного года выпуска, цена которых больше указанной");

		String choose = reader.readLine();
		char c = choose.charAt(0);
				
		switch (c) {
		case 'a': {
			System.out.println("Выберите марку авто (цифру)");
			System.out.println("1 - Nissan");
			System.out.println("2 - Renault");
			System.out.println("3 - Toyota");
			System.out.println("4 - Volvo");
			String tempMarka=null;
			String choose2 = reader.readLine();
			char c2 = choose2.charAt(0);
			switch (c2){		
				case '1' : tempMarka="Nissan";
				break;
				case '2' : tempMarka="Renault";
				break;
				case '3' : tempMarka="Toyota";
				break;
				case '4' : tempMarka="Volvo";
				break;
			}		
			foundCar = findCarByMarka(tempMarka);
			break;}
		
		case 'b': {
			System.out.println("Выберите модель авто (цифру)");
			System.out.println("1 - Qashqai");
			System.out.println("2 - S60");
			System.out.println("3 - Patrol");
			System.out.println("4 - S60");
			String tempModel=null;
			String choose3 = reader.readLine();
			char c3 = choose3.charAt(0);
			switch (c3) {
				case '1': tempModel="Qashqai";
				break;
				case '2': tempModel="S60";
				break;
				case '3': tempModel="Patrol";
				break;
				case '4': tempModel="S60";
				break;
			}
			
			System.out.println("Введите возраст авто");
			
			int vozrast = Integer.parseInt(reader.readLine());
			
			foundCar = findCarByModel(tempModel, vozrast);
			break;
		}
		case 'c': {
			
			System.out.println("Введите год выпуска авто");
			
			int god_vip = Integer.parseInt(reader.readLine());
			System.out.println("Введите цену");
			int price = Integer.parseInt(reader.readLine());
			
			foundCar = findCarByGodPrice(god_vip, price);
			
			break;
		}
		
		}
		if (foundCar != null) 
			printFoundCar(foundCar);
	}

		public static Car [] buildCar() {
	
		Car[] myCar = new Car[6]; 
		
		myCar[0] = new Car (1, "Nissan", "Qashqai", 2009, "black", 10000, 881);
		myCar[1] = new Car (2, "Nissan", "Qashqai", 2010, "white", 30000, 867);
		myCar[2] = new Car (3, "Nissan", "Patrol", 2011, "yellow", 10000, 832);
		myCar[3] = new Car (4, "Volvo", "S60", 2012, "blue", 10000, 845);
		myCar[4] = new Car (5, "Renault", "Megane", 2012, "pink", 10000, 878);
		myCar[5] = new Car (6, "Toyota", "RAV4", 2014, "purple", 10000, 891);
		
		return myCar;
		
		}
	
	public static Car[] findCarByMarka(String tempMarka) {
		Car [] foundCar = new Car[6];
		int i = 0;
		for (Car a : myCar) {
			if (a.getMarka().equals(tempMarka)) {
				foundCar[i] = a;
				i++;
			}
		}
		return foundCar;
	}
	
	public static Car[] findCarByModel(String tempModel, int vozrast) {
		Car [] foundCar = new Car[6];
		int i = 0;
		for (Car a : myCar) {
			if (a.getModel().equals(tempModel)&& (2016-a.getYear())>vozrast) {
				foundCar[i] = a;
				i++;
			}
		}
		return foundCar;
	}

	public static Car[] findCarByGodPrice(int god_vip, int price) {
		Car [] foundCar = new Car[6];
		int i = 0;
		for (Car a : myCar) {
			if (a.getYear()==god_vip  && a.getPrice()>price) {
				foundCar[i] = a;
				i++;
			}
		}
		return foundCar;
	}
	
	
	 
	public static void printFoundCar(Car [] foundCar) {
		for (Car s : foundCar) {
			if (s != null)
			System.out.println(s.toString());
		}
	}
}
  
		 
