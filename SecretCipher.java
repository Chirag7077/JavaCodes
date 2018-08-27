import java.io.*;
import java.util.*;

class SecretCipher{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the plain text: ");
		String plainText = sc.nextLine();
		System.out.println("\n\n");
		String cipherString = "";
		String decipherString = "";
		String output = "";
		String encrypt = encryptStageOne(plainText,cipherString);
		String encryptStringTwo = encryptStageTwo(encrypt);
		String encryptFinalString = encryptFinalStage(encryptStringTwo,output);
		System.out.println("Ciper Text: "+encryptFinalString);
		System.out.println("\n\n");
		String decrypt = decryptStageOne(encryptFinalString);
		String decryptStringTwo = decryptStageTwo(decrypt);
		String finalDecryptString = decryptFinalStage(decryptStringTwo,decipherString);
		System.out.println("Decipher: "+finalDecryptString);
	}

	static String encryptStageOne(String plainText, String cipherString){
		char[] cipherCharArray = plainText.toCharArray();
		for(int i=0;i<cipherCharArray.length;i++){
			if(i%2 == 0){
				char ch = encodeEven(cipherCharArray[i]);
				cipherString = cipherString + ch;
			}else{
				char ch = encodeOdd(cipherCharArray[i]);
				cipherString = cipherString + ch;
			}
		}
		return cipherString;
	}
	
	static char encodeEven(char i){
		char ch = Character.toUpperCase(i);
		int val = ch - 'A';
		int value = ((val * 19)+1)%26;
		char finalChar = findCharacter(value);
		return finalChar;
	}

	static char encodeOdd(char i){
		char ch = Character.toUpperCase(i);
		int val = ch - 'A';
		int value = ((val * 17)+1)%26;
		char finalChar = findCharacter(value);
		return finalChar;
	}

	static String encryptStageTwo(String plaintxt)
	{
		boolean checkdown=false; 
		int j=0;
		int row=3;
		int col=plaintxt.length();
		char[][] a=new char[row][col];
		for(int i=0;i<col;i++){
		if(j==0||j==row-1)
			checkdown=!checkdown;
		a[j][i]=plaintxt.charAt(i);
		if(checkdown){
			j++;
		}
		else
			j--;
		}
		String ciphertxt="";
		for(int i=0;i<row;i++){
			for(int k=0;k<col;k++){
			if(a[i][k]!=0)
			ciphertxt=ciphertxt+a[i][k];
			}
		}
		//System.out.println("Ciphertext : "+ciphertxt);
		return ciphertxt;
	}

	static String encryptFinalStage(String input,String output){
		String cha = "";
		char[] cipherFinalStage = input.toCharArray();
		for(int i=0;i<cipherFinalStage.length;i++){
			cha = findCode(cipherFinalStage[i]);
			output = output + cha;
		}
		return output;
	}

	static char findCharacter(int num){
		char c = '\0';
		switch(num){
			case 0 :
				c = 'A';
				break;
			case 1 :
				c = 'B';
				break;
			case 2 :
				c = 'C';
				break;
			case 3 :
				c = 'D';
				break;
			case 4 :
				c = 'E';
				break;
			case 5 :
				c = 'F';
				break;
			case 6 :
				c = 'G';
				break;
			case 7 :
				c = 'H';
				break;
			case 8 :
				c = 'I';
				break;
			case 9 :
				c = 'J';
				break;
			case 10 :
				c = 'K';
				break;
			case 11 :
				c = 'L';
				break;
			case 12 :
				c = 'M';
				break;
			case 13 :
				c = 'N';
				break;
			case 14 :
				c = 'O';
				break;
			case 15 :
				c = 'P';
				break;
			case 16 :
				c = 'Q';
				break;
			case 17 :
				c = 'R';
				break;
			case 18 :
				c = 'S';
				break;
			case 19 :
				c = 'T';
				break;
			case 20 :
				c = 'U';
				break;
			case 21 :	
				c = 'V';
				break;
			case 22 :
				c = 'W';
				break;
			case 23 :
				c = 'X';
				break;
			case 24 :
				c = 'Y';
				break;
			case 25 :
				c = 'Z';
				break;
		}
		return c;
	}

	static String findCode(char c){
		String interm = "";
		switch(c){
			case 'A':
				interm = "._. ";
				break;
			case 'B':
				interm = "._.. ";
				break;
			case 'C':
				interm = "._... ";
				break;
			case 'D':
				interm = "._.... ";
				break;
			case 'E':
				interm = "._..... ";
				break;
			case 'F':
				interm = ".._. ";
				break;
			case 'G':
				interm = ".._.. ";
				break;
			case 'H':
				interm = ".._... ";
				break;
			case 'I':
				interm = ".._.... ";
				break;
			case 'J':
				interm = ".._..... ";
				break;
			case 'K':
				interm = "..._. ";
				break;
			case 'L':
				interm = "..._.. ";
				break;
			case 'M':
				interm = "..._... ";
				break;
			case 'N':
				interm = "..._.... ";
				break;
			case 'O':
				interm = "..._..... ";
				break;
			case 'P':
				interm = "...._. ";
				break;
			case 'Q':
				interm = "...._.. ";
				break;
			case 'R':
				interm = "...._... ";
				break;
			case 'S':
				interm = "...._.... ";
				break;
			case 'T':
				interm = "...._..... ";
				break;
			case 'U':
				interm = "....._. ";
				break;
			case 'V':
				interm = "....._.. ";
				break;
			case 'W':
				interm = "....._... ";
				break;
			case 'X':
				interm = "....._.... ";
				break;
			case 'Y':
				interm = "....._..... ";
				break;
			case 'Z':
				interm = "......_. ";
				break;
		}
		return interm;
	}

	static char findAlpha(String code){
		char alphas = '\0';
		switch(code){
			case "._.":
				alphas = 'A';
				break;
			case "._..":
				alphas = 'B';
				break;
			case "._...":
				alphas = 'C';
				break;
			case "._....":
				alphas = 'D';
				break;
			case "._.....":
				alphas = 'E';
				break;
			case ".._.":
				alphas = 'F';
				break;
			case ".._..":
				alphas = 'G';
				break;
			case ".._...":
				alphas = 'H';
				break;
			case ".._....":
				alphas = 'I';
				break;
			case ".._.....":
				alphas = 'J';
				break;
			case "..._.":
				alphas = 'K';
				break;
			case "..._..":
				alphas = 'L';
				break;
			case "..._...":
				alphas = 'M';
				break;
			case "..._....":
				alphas = 'N';
				break;
			case "..._.....":
				alphas = 'O';
				break;
			case "...._.":
				alphas = 'P';
				break;
			case "...._..":
				alphas = 'Q';
				break;
			case "...._...":
				alphas = 'R';
				break;
			case "...._....":
				alphas = 'S';
				break;
			case "...._.....":
				alphas = 'T';
				break;
			case "....._.":
				alphas = 'U';
				break;
			case "....._..":
				alphas = 'V';
				break;
			case "....._...":
				alphas = 'W';
				break;
			case "....._....":
				alphas = 'X';
				break;
			case "....._.....":
				alphas = 'Y';
				break;
			case "......_.":
				alphas = 'Z';
				break;
		}
		return alphas;
	}

	static String decryptStageOne(String cipherText){
		String decipherString = "";
		String[] arrOfCode = cipherText.split(" ");
		for(int i = 0;i<arrOfCode.length;i++){
			char alpha = findAlpha(arrOfCode[i]);
			decipherString = decipherString + alpha;
		}
		return decipherString;
	}
	static String decryptStageTwo(String ciphertxt)
	{
		boolean checkdown=false;
		int j=0;
		int row=3;
		int col=ciphertxt.length();
		char[][] a=new char[row][col];
		for(int i=0;i<col;i++){
			if(j==0||j==row-1)
				checkdown=!checkdown;
			a[j][i]='*';
			if(checkdown)
				j++;
			else 
				j--;
		}
		int index=0;
		for(int i=0;i<row;i++){
			for(int k=0;k<col;k++){
				if(a[i][k]=='*'&&index<ciphertxt.length()){
					a[i][k]=ciphertxt.charAt(index++);
				}
			}
		}
		checkdown=false;
		String plaintxt="";
		j=0;
		for(int i=0;i<col;i++){
			if( j==0||j==row-1)
				checkdown=!checkdown;
			plaintxt+=a[j][i];
			if(checkdown)
				j++;
			else 
				j--;
		}
		return plaintxt;
	}

	static String decryptFinalStage(String plainText, String cipherString){
		char[] cipherCharArray = plainText.toCharArray();
		for(int i=0;i<cipherCharArray.length;i++){
			if(i%2 == 0){
				char ch = decodeEven(cipherCharArray[i]);
		//		System.out.println(ch);
				cipherString = cipherString + ch;
			}else{
				char ch = decodeOdd(cipherCharArray[i]);
		//		System.out.println(ch);
				cipherString = cipherString + ch;
			}
		}
		return cipherString;
	}
	
	static char decodeEven(char i){
		char ch = Character.toUpperCase(i);
		int val = ch - 'A';
		int value = ((val - 1)*11)%26;
		//System.out.println(value);
		char finalChar = findCharacter(value);
		return finalChar;
	}

	static char decodeOdd(char i){
		char ch = Character.toUpperCase(i);
		int val = ch - 'A';
		int value = ((val - 1)*23)%26;
		//System.out.println(value);
		char finalChar = findCharacter(value);
		return finalChar;
	}
}