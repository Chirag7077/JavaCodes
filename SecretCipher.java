import java.io.*;
import java.util.*;

class SecretCipher{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the plain text: ");
		String plainText = sc.nextLine();
		String cipherString = "";
		String encrypt = encryptStageOne(plainText,cipherString);
	}
	static String encryptStageOne(String plainText, String cipherString){
		Char[] cipherCharArray = plainText.toCharArray();
		for(i=0;i<cipherCharArray.length();i++){
			if(i%2 == 0){
				value = [[i*17]+1] % 26
			}else{
				value = [[i*11]+1] % 26
			}
			if((value>=48 && value<=54) | (value>=65 && value<=87) | (value>=97 && value<= 119)){
                int val = value+i;
                finalString = finalString+m;
            }
            // This case is for alphabets X,Y,Z
            else if((value>87 && value<=90) | (value>119 && value<=122)){
                int val = value+i;
                int value = val-26;
                finalString = finalString+m;
            }
            // This case is for numbers 7,8,9
            else if(value>54 && value<=57){
                int val = value+i;
                int value = val-10;
                finalString = finalString+m;
            }
            // White Spaces would remain the same
            else{
                finalString = finalString+m;
            }
		}
		return "One"
	}
}

static char tochar(int x){
	char ch = (char)x;
    return ch;
}
