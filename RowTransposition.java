import java.util.*;
import java.io.*;

class RowTransposition{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the plain text: ");
		String plainText = sc.nextLine();
		encryptMessage(plainText,rows);
	}

	public static void encryptMessage(String plainText, int rows){
		char[] encryptMessageArray = plainText.toCharArray();
		int len = plainText.length();
		int columns = len/rows;
		if(len%rows != 0)
			columns++;
		System.out.print("Number of columns: "+columns);

		char[][] matrix = new int[rows][columns];
        int k=0;
        for(j=0;j<columns;j++)
        {
               
            for(i=0;i<rows;i++)
            {
                if(k == len)
                {
                    matrix[i][j]='x';
                }
                else 
                    matrix[i][j]=c[k];
                k++;
            }
        }
	}
}