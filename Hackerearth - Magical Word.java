import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int length = sc.nextInt();
            String str = sc.next();
            System.out.println(getDhananjayWord(str));
        }
    }
    static String getDhananjayWord(String str){
        String out = "";
        char strChar[] = str.toCharArray();
        for(int i=0;i<strChar.length;i++){
            int ascii = (int)strChar[i];
            if(ascii <= 65){
                int near = 67;
                char outcome = (char)near;
                out+=outcome;
            }
            else if(isPrime(ascii)){
                out+=strChar[i];
            }
            else
            {
                int near = nearestPrime(ascii);
                char outcome = (char)near;
                out+=outcome;
            }    
        }
        return out;
    }
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }
    
    public static int nearestPrime(int num){
        int diff1=0,diff2=0;
        int num1=0,num2=0;
        for(int i=num;;i++)
        {
            if(isPrime(i))
            {
                diff1=i-num;
                num1=i;
                break;
            }
        }
        for(int i=num;;i--)
        {
            if(isPrime(i))
            {
                diff2=num-i;
                num2=i;
                break;
            }
        }
        if(num1 >= 127){
            return num2;
        }
        if(num1 <= 61){
            return num2;
        }
        if(num2 >= 127){
            return num1;
        }
        if(num2 <= 61){
            return num1;
        }
        if(diff1==diff2)
            return Math.min(num1,num2);
        else if (diff1<diff2)
            return num1;
        else
            return num2;
    }
}
