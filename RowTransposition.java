import java.util.*;
import java.io.*;

class RowTransposition{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the string to encrypt: ");
		String inputString = sc.nextLine();
		String encryptedString = rowTranspositionEncryption(inputString,rows);
	}
	static String rowTranspositionEncryption(String input,int key){
		char[] encryptArray = input.toCharArray();
		int len = input.length();
		int k =0;
		int column = len/key;
		if(len%column != 0){
			column+=1;
		}
		char[][] matrix = new char[key][column];
		for(int i=0;i<column;i++){
			for(int j=0;j<key;j++){
				matrix[j][i] = encryptArray[k];
				k++;
			}
		}
		for(int i=0;i<key;i++){
			for(int j=0;j<column;j++){
				System.out.print(matrix[i][j]+" ");
			}
		}
		return "Hello";
	}
}