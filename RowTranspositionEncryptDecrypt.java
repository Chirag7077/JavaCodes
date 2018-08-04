import java.util.*;
import java.io.*;

public class RowTranspositionEncryptDecrypt {
    public static void main(String[] args) {
        //Take the message and key as input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key value : ");
        int key=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string to be encrypted : ");
        String encryptInput=sc.nextLine();
        encrypt(encryptInput, key);
		System.out.println("Enter the string to be decrypted : ");
        String decryptInput=sc.nextLine();
		//Function to decrypt
        decrypt(decryptInput, key);
    }
	//function to encrypt message
    static void encrypt(String encryptInput, int key) {
        char[] encryptCharArray=encryptInput.toCharArray();
        int len=encryptCharArray.length;
        int extra;
        int column=0;
        int k=0;
        int i=0, j=0;
        //find the number of columns required
        if(len%key!=0)
        {
            column=(len/key)+1;
        }
        else
        {
            column=len/key;
        }
        //create matrix
        char[][] matrix=new char[key][column];
        //insert the string column-wise
        for(j=0; j<column; j++)
        {
            for(i=0; i<key; i++, k++)
            {
                matrix[i][j]=encryptCharArray[k];
            }
        }
        System.out.println("The encrypted array is : ");
		//Read the message row-wise
        for(i=0; i<key; i++)
        {
            for(j=0; j<column; j++, k++)
            {
                System.out.print(matrix[i][j]);
            }
        }
            System.out.println("");
     }

	static void decrypt(String decryptInput, int key) {
        char[] decryptCharArray=decryptInput.toCharArray();
        int len=decryptCharArray.length;
        int extra;
        int column=0;
        int k=0;
        int i=0, j=0;
        //find number of columns using key and length of the string
        if(len%key!=0)
        {
            column=(len/key)+1;
        }
        else
        {
            column=len/key;
        }
        //create the matrix
        char[][] matrix=new char[key][column];
        //insert the cipher text row wise
        for(i=0; i<key; i++)
        {
            for(j=0; j<column; j++, k++)
            {
                matrix[i][j]=decryptCharArray[k];
            }
        }
        System.out.println("The decrypted character array is : ");
		//Read the message column wise
        for(j=0; j<column; j++)
        {
            for(i=0; i<key; i++, k++)
            {
                System.out.print(matrix[i][j]);
            }
        }
            System.out.println("");
	}
}

