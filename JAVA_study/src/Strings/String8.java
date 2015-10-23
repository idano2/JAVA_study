package Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class String8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Введите число строк и нажмите Ввод: ");
		int a=Integer.parseInt(reader.readLine());
		System.out.print("Введите число столбцов и нажмите Ввод: ");
		int b=Integer.parseInt(reader.readLine());
			int[][] myArray = new int[a][b];	
			for (int i=0; i<a; i++){
				for (int j=0; j<b; j++){
					myArray[i][j]=(int)(Math.random()*10);
				System.out.print(myArray[i][j]+ " ");
				}
				System.out.println("");
			}
			int[][] myArrayTempStroki = new int[a][b];
			int[][] myArrayTempStolbi = new int[a][b];
			for (int i=0; i<a; i++){
				for (int j=0; j<b; j++){	
					myArrayTempStolbi[i][j]=1;
					myArrayTempStroki[i][j]=1;
				}         
			}                                  
					                                  
			for (int i=0; i<a; i++){
				for (int j=0; j<b; j++){
			 		if(myArray[i][j]==0){
			 			for (int w=0; w<b; w++){ 
						myArrayTempStroki[i][w]=0;
			 			}
			 			for (int q=0; q<a; q++){
			 			myArrayTempStolbi[q][j]=0;
			 			}
			 			}
			 		
				}
			}
			for (int i=0; i<a; i++){
				for (int j=0; j<b; j++){
					if (myArrayTempStroki[i][j]==0 || myArrayTempStolbi[i][j]==0){
						myArray[i][j]=0;
					}
				}
			}
			
			
			System.out.println("");	
			for (int i=0; i<a; i++){
				for (int j=0; j<b; j++){
					System.out.print(myArray[i][j]+ " ");
				}
				System.out.println("");		
			}
			
	}
	}