import java.util.*;
import java.io.*;

class MatrixMultiplication{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		// Matrix A
		System.out.print("Data for Matrix A\n");
		System.out.print("Enter the number of rows: ");
		int rowsA = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columnsA = sc.nextInt();

		int matrixA[][] = new int[rowsA][columnsA];
		for(int i=0;i<rowsA;i++){
			for(int j=0;j<columnsA;j++){
				System.out.print("Enter the element "+i+"x"+j+" of the matrix A: ");
				matrixA[i][j] = sc.nextInt();
			}
			System.out.print("\n");
		}
		System.out.print("\n");

		// Matrix B
		System.out.print("Data for Matrix B\n");
		System.out.print("Enter the number of rows: ");
		int rowsB = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columnsB = sc.nextInt();

		int matrixB[][] = new int[rowsB][columnsB];
		for(int i=0;i<rowsB;i++){
			for(int j=0;j<columnsB;j++){
				System.out.print("Enter the element "+i+"x"+j+" of the matrix: ");
				matrixB[i][j] = sc.nextInt();
			}
			System.out.print("\n");
		}
		System.out.print("\n");

		// Result Matrix C
		int matrixC[][] = new int[rowsA][columnsA];

		// Multiplying A and B

		if(columnsA == rowsB){
			matrixC = multiplyMatrix(matrixA,matrixB,matrixC,rowsA);
		}else{
			System.out.print("Matrix Multiplication cannot be performed.");
		}
		//Displaying the matrix
		System.out.println("The result matrix C is : ");
		for(int i=0;i<rowsA;i++){
			for(int j=0;j<columnsA;j++){
				System.out.print(matrixC[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

	static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB, int[][] matrixC, int x){
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				for(int k=0;k<x;k++){
					matrixC[i][j] = matrixC[i][j] + matrixA[i][k]*matrixB[k][j];
				}
			}
		}
		return matrixC;
	}
}