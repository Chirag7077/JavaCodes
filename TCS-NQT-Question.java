/*
    Given a range between 1 & 100, print the numbers
    as follows,
    Range - 9, 14
    O/p - 009, 010, 012, 013, 014 
*/

public class Main
{
	public static void main(String[] args) {
		for(int i = 0; i<= 100; i++){
		    int len = Integer.toString(i).length();
		    //System.out.println(len);
		    if(len < 3)
		        System.out.printf("%03d\n",i);
		    else
		        System.out.println(i);
		}
	}
}