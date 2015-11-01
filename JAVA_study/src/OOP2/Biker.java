package OOP2;

//import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biker {

	public static List<Equipment>myEquipment;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		
		List<Equipment> foundEquipment = null;
		
		myEquipment = buildEquipment();
		
		do {
		System.out.println("Введите а - если необходимо вывести список несортированный список экипировки");
		System.out.println("Введите b - если необходимо вывести список отсортированный по весу список экипировки");
		System.out.println("Введите c - если необходимо вывести элементы экипировки соответствующие заданному диапазону параметров цены");
	    System.out.println("Введите d - если необходимо вывести данные из файла");
		System.out.println("Введите e - если хотите выйти из программы");
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		
		String choose = reader.readLine();
	
		char c = choose.charAt(0);
				
		switch (c) {
			case 'a': {
				
				foundEquipment = findEquipmentUnsorted();
				break;
			}
		
			case 'b': {
				
				foundEquipment = findEquipmentByWeight();
				break;
			}
			
			case 'c': {
				
				System.out.println("Введите желаемы диапазон цены");
				System.out.print("Min=");
				int min = Integer.parseInt(reader.readLine());
				System.out.print("Max=");
				int max = Integer.parseInt(reader.readLine());
				
				foundEquipment = findEquipmentByPrice(min, max);
				
				break;
			}
			
		   case 'd': {
				
				System.out.println("Данные из файла");
				foundEquipment = findEquipmentByFile();
				if (foundEquipment == null){
					System.out.println("Файл пуст");	
				} 
				
				break;
			}
			
			
			case 'e': {
				
				System.exit(0);
			}
			
			default:
	            System.out.println("Введен неверный символ!");
	            System.out.println("");
	            break;
		}
	
		if (foundEquipment != null) 
			printfoundEquipment (foundEquipment);
	
		}
		
		while(true);
		
	}
	
			public static List<Equipment> buildEquipment() {
				
				List<Equipment>myEquipment = new ArrayList<Equipment>(); 
				
				myEquipment.add(new Helmet ("Helmet", "XL", 1000, 20));
				myEquipment.add(new Jacket ("Jacket", "XXL", 800, 15));
				myEquipment.add(new Pants ("Pants", "XS", 700, 25));
				myEquipment.add(new Shoes ("Shoes", "XXXL", 500, 30));
				myEquipment.add(new Gloves ("Gloves", "XS", 100, 10));
		
				return myEquipment;
				
			}
			public static List<Equipment> findEquipmentUnsorted() {
				
				List<Equipment>foundEquipment = new ArrayList<Equipment>();
				
				for (Equipment item : myEquipment) {
					foundEquipment.add(item);
				}
							
				return foundEquipment;
			}
			
			public static List<Equipment> findEquipmentByWeight() {
			

				class SortedByWeight implements Comparator<Equipment> {
				      
				       public int compare(Equipment obj1, Equipment obj2) {
				            
				             double weight1 = obj1.getWeight();
				             double weight2 = obj2.getWeight();

				             if(weight1 > weight2) {
				                    return 1;
				             }
				             else if(weight1 < weight2) {
				                    return -1;
				             }
				             else {
				                    return 0;
				             }
				       }
				  }
				List<Equipment>foundEquipment = new ArrayList<Equipment>();
				Collections.sort (myEquipment, new SortedByWeight());
								
				for (Equipment item : myEquipment) {
						foundEquipment.add(item);
				}
			
				return foundEquipment;
			}
			
			public static List<Equipment> findEquipmentByPrice(int min, int max) {
				
				List<Equipment>foundEquipment = new ArrayList<Equipment>();
				
				for (Equipment item : myEquipment) {
					if (item.getCost()>=min  && item.getCost()<=max) {
						foundEquipment.add(item);
					}
				}
							
				return foundEquipment;
			}
			
		    public static List<Equipment> findEquipmentByFile() {
				List<Equipment>foundEquipment =  new ArrayList<Equipment>();
			    
				try {
				    ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("objects.dat"));
				    boolean check=true;
				    while (check) {

				try{
				
				foundEquipment.add((Equipment) objIn.readObject());
				}
				
				catch(EOFException ex){
				check=false;
				}

				    }
				    objIn.close();
				} catch(Exception e) {
				    e.printStackTrace();
				}
							
				return foundEquipment;
			}
						
			public static void printfoundEquipment(List<Equipment> foundEquipment) throws IOException {
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
				
				for (Equipment s : foundEquipment) {
					if (s != null){
					System.out.println(s.toString());
					out.writeObject(s);
					}
				}
				out.close();
				System.out.println("");
			}
}
