import java.util.*;
import java.io.*;

class CeaserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String entry = sc.nextLine();
        System.out.println();
        String finalDecryptString = "";
        String inputForDecryption = "";
        System.out.println("Input String: "+entry);
        String finalString = encryptString(entry);
        System.out.println("Encrypted String: "+finalString+"\n");
        System.out.print("Would you like to decrypt a String ? (1/0) : ");
        int ch = sc.nextInt();
        System.out.println();
        sc.nextLine();
        if(ch == 1){
            System.out.println("Enter the string you wish to decrypt: ");
            inputForDecryption = sc.nextLine();
            finalDecryptString = decryptString(inputForDecryption);
        }else{
            System.exit(0);
        }
        System.out.println();
        System.out.println("Input String: "+inputForDecryption);
        System.out.println("Decrypted String: "+finalDecryptString);   
        }
        //This function converts an integer to character as per the ASCII value
        static char tochar(int x){
            char ch = (char)x;
            return ch;
    }
    //This function encrypts the string passed and returns the encrypted String.
    static String encryptString(String input){      
        int len = input.length();
        char[] entryarr;
        entryarr = input.toCharArray();
        String finalString = "";
        for(int i=0;i<len;i++){
            int c = entryarr[i];
            //This case is for alphabets A to W and numbers 0 to 6
            if((c>=48 && c<=54) | (c>=65 && c<=87) | (c>=97 && c<= 119)){
                int val = c+3;
                char m = tochar(val);
                finalString = finalString+m;
            }
            // This case is for alphabets X,Y,Z
            else if((c>87 && c<=90) | (c>119 && c<=122)){
                int val = c+3;
                int value = val-26;
                char m = tochar(value);
                finalString = finalString+m;
            }
            // This case is for numbers 7,8,9
            else if(c>54 && c<=57){
                int val = c+3;
                int value = val-10;
                char m = tochar(value);
                finalString = finalString+m;
            }
            // White Spaces would remain the same
            else if(c == 32){
                char m = tochar(c);
                finalString = finalString+m;
            }
            else{
                System.out.println("Special characters cannot be encrypted.");
            }
        }
        return finalString;
    }
    //This function decrypts the string passed and returns the decrypted String.
    static String decryptString(String entry){
        int len = entry.length();
        char decryptArray[];
        String outputString = "";
        decryptArray = entry.toCharArray();
        for(int i=0;i<len;i++){
            int c = decryptArray[i];
            //This case if for alphabets D to Z and numbers 3 to 9
            if((c>=51 && c<=57) | (c>=68 && c<=90) | (c>=100 && c<=122)){ 
                int val = c-3;
                char n = tochar(val);
                outputString += n;
            }
            //This case is for alphabets A,B,C
            else if((c<68 && c>=65) | (c<100 && c>= 97)){
                int val = c-3;
                int value = val+26;
                char n = tochar(value);
                outputString += n;
            }
            //This case is for numbers 0,1,2
            else if(c<51 && c>=48){
                int val = c-3;
                int value = val+10;
                char n = tochar(value);
                outputString += n;
            }
            //White Spaces would remain the same. 
            else if(c == 32){
                char m = tochar(c);
                outputString = outputString+m;
            }
            else{
                System.out.println("Special characters cannot be encrypted.");
            }
        }
        return outputString;
    }
}