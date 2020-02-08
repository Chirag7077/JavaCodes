/*
The method will read a String value and print the minimum valued character (as per alphabet and ASCII sequence). 

Consider below sample input and output:
Input:
HellO

Output:
H

Important: Answer is not 'e' since 'H' has lower ASCII value then 'e'
*/

import java.util.*;

public class TCSXploreQ2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int minimum = 9999;
        for(int i = 0; i<inp.length(); i++){
            if(minimum > (int)inp.charAt(i)){
                minimum = (int)inp.charAt(i);
            }
        }
        System.out.println((char)minimum);
    }
}