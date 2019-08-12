/*
    Question: https://www.hackerearth.com/practice/basic-programming/
        input-output/basics-of-input-output/practice-problems/algorithm/seating-arrangement-1/
*/

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int seatNumber = sc.nextInt();
            int seatType = seatNumber % 12;
            String seatTypeS = "";
            if(seatType == 0 || seatType == 1 || seatType == 6 || seatType == 7){
                seatTypeS = "WS";
            }else if(seatType == 2 || seatType == 5 || seatType == 8 || seatType == 11){
                seatTypeS = "MS";
            }else{
                seatTypeS = "AS";
            }
            System.out.println(findSeat(seatNumber,seatType)+" "+seatTypeS);
        }
    }
    static String findSeat(int seatNumber, int seatType){
        if(seatType == 0)
            return Integer.toString(seatNumber - 11);
        else if(seatNumber < 12)
            return Integer.toString(13 - seatNumber);
        else{
            int q = 13 - seatType;
            return Integer.toString(q - seatType + seatNumber);
        }
    }
}
