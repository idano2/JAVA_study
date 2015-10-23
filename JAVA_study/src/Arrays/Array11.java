package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите желаемую размерность матрицы и нажмите Ввод: ");
		int a=Integer.parseInt(reader.readLine());
			System.out.println("Вводите значения матрицы");
			int[][] myArray = new int[a][a];	
			for (int i=0; i<a; i++){
				for (int j=0; j<a; j++){
					myArray[i][j]=Integer.parseInt(reader.readLine());
				}
			}
			for (int i=0; i<a; i++){
				for (int j=0; j<a; j++){
				System.out.print(myArray[i][j]+ " ");
				}
				System.out.println("");
			}
		int x=0;
		int y=0;
		int z=0;
		int min_temp=-1000000000;
		
		for (int i=0; i<a; i++){
			int min = myArray[x][y];
			int min_index=z;
			
			for (int j=i; j<a; j++){
		 	if(min < min_temp){
				for (int w=i; w<a; w++){
				
				if (myArray[i][w]>min_temp){
					for (int q=0; q<a; q++){
					int temp = myArray[q][min_index];
					myArray[q][min_index]=myArray[q][j];
					myArray[q][j]=temp;
					}
				 }
				}
			}
		 	if(min < min_temp) 	{
		 		System.out.println("Введенная матрица не может отсортирована по условиям задачи");
		 		System.exit(0);
			}
		 	
						
				if (myArray[i][j]<min && myArray[i][j]>min_temp){
					min=myArray[i][j];
					for (int q=0; q<a; q++){
					int temp = myArray[q][min_index];
					myArray[q][min_index]=myArray[q][j];
					myArray[q][j]=temp;
					}
				}
			}
			min_temp=myArray[x][y];
			x=x+1;
			y=y+1;
			z=z+1;
			
		}		
		System.out.println("");
		for (int i=0; i<a; i++){
			for (int j=0; j<a; j++){
				System.out.print(myArray[i][j]+ " ");
			}
			System.out.println("");
			}
	}
}
			
	
		
		