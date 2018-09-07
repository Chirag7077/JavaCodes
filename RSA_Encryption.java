import java.util.*;
import java.lang.*;
import java.lang.Math;
 
public class RSA_Encryption{
     
   public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int p,q,n,e,d,P,C,PhiOfN;

        System.out.print("Enter a prime number: ");
        p=sc.nextInt();
        System.out.print("Enter another prime number: ");
        q=sc.nextInt();

        n=p*q;
        PhiOfN=(p-1)*(q-1);
        
        System.out.print("Enter an integer between 1 and "+PhiOfN+" : ");
        e=sc.nextInt();
        System.out.print("Enter the plain text: ");
        P=sc.nextInt();

        C=encipher(P,n,e);
        System.out.print("Cipher Text: "+C+"\n");

        d=multiplicative_inverse(PhiOfN,e);
        P=decipher(C,n,d);
        System.out.print("Plain Text: "+P);
    }

    public static int encipher(int P,int n,int e)
    {
        int encrypt_text,raise1;
        raise1=(int)Math.pow(P,e);

        encrypt_text=(raise1%n);
        return encrypt_text;
    }
    public static int decipher(int C,int n,int d)
    {
        int decrypt_text,raise2;
        raise2=(int)Math.pow(C,d);
        decrypt_text=(raise2%n);
        return decrypt_text;
}
    public static int multiplicative_inverse(int PhiOfN,int e)
    {
        int mid,inverse=1,i;
        for(i=0;i<PhiOfN;i++)
        {
            mid=i*e;
            if((mid % PhiOfN)==1)
            {
                inverse=i;
                break;
            }
        }
        return inverse;
    }
}
