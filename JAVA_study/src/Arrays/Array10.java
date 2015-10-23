package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите желаемую размерность матрицы и нажмите Ввод: ");
		int a=Integer.parseInt(reader.readLine());
		int[][] myArray = new int[a][a];	
			for (int i=0; i<a; i++){
				for (int j=0; j<a; j++){
					myArray[i][j]=(int)(Math.random()*10+1);
				System.out.print(myArray[i][j]+ " ");
				}
				System.out.println("");
			}
		int[]glDiag=new int[a];
		int[]pobDiag=new int[a];
		
		for (int i=0; i<a; i++){
			for (int j=0; j<a; j++){
				if (i==j){
					glDiag[i]=myArray[i][j];
				}
				if (j==a-i-1){
					pobDiag[i]=myArray[i][j];
				}
				}
			}	
		System.out.print("Главная диагональ: ");
		for (int i:glDiag)
		{
			System.out.print(i+ " ");
		}
		System.out.println("");
		System.out.print("Побочная диагональ: ");
		for (int i:pobDiag)
		{
			System.out.print(i+ " ");
		}
		}
	}
		
		