/*
Factorials of input numbers
Write a program to read 5 numbers and print factorials of each.
(Final answers should be non decimal numbers).
Example:
Input:
2
3
4
6
5

Output:
2
6
24
720
120
*/

import java.util.*;
import java.math.*;

public class TCSXploreQ4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String outs[] = new String[5];
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            outs[i] = factorial(num);
        }
        for(String x : outs){
            System.out.println(x);
        }
    }

    public static String factorial(int num){
        BigInteger fact = new BigInteger("1");
        for(int i = 1;i<=num; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact.toString();
    }
}