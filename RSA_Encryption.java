import java.util.*;
import java.io.*;

class RSA_Encryption{
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter the plain text: ");
		double input = sc.nextInt();
		System.out.print("Enter a prime number: ");
		double p = sc.nextInt();
		System.out.print("Enter another prime number: ");
		double q = sc.nextInt();
		double n = p*q;
		double func = (p-1)*(q-1);
		System.out.print("Enter a key (1<e<func): ");
		double e = sc.nextInt();
		System.out.println(p+" "+q+" "+n+" "+func);

		double encrypted = (Math.pow(input,e))%n;
		System.out.println(encrypted);

		double d = modInverse(e,func);
		double decrypted = (Math.pow(encrypted,d))%n;
		System.out.println(decrypted);
	}

	static double modInverse(double a, double m)
    {
        a = a % m;
        for (int x = 1; x < m; x++)
           if ((a * x) % m == 1)
              return x;
        return 1;
    }
}