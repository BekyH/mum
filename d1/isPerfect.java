package com.company;

public class isPerfect {
    //question 1
    public static void main(String[] args) throws Exception{
        int result = isPefectSquare(15);
        System.out.print(result);
    }
    // a function that returns the next perfect square of the given integer n.
    static int isPefectSquare(int n){
        if(n<0){
            return 0;

        }

        double x = Math.sqrt(n);
        String st =String.valueOf(Math.round(Math.floor(x)));
        int y = Integer.parseInt(st);
        y = y + 1;
        int nxtperfectSquare = y * y;

        return nxtperfectSquare;



    }
}
