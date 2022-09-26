public class countDig {

    public static void main(String[] args) {
        int n = 32121;
        int digit = 1;
        System.out.println(countDigit(n,digit));
    }
    //questions
    /**. Write a function named countDigit that returns the number of times that a given digit appears in a positive
     number. For example countDigit(32121, 1) would return 2 because there are two 1s in 32121.
     countDigit(33331, 3) returns 4
     countDigit(33331, 6) returns 0
     countDigit(3, 3) returns 1
     The function should return -1 if either argument is negative
     The function signature is
     int countDigit(int n, int digit)
     **/
    public static int countDigit(int n,int digit){
         if(n<0 || digit<0){
             return -1;
         }
         int counter = 0;
         while(n>0){
             int lastdig = n%10;
             if(digit==lastdig){
                 counter++;
             }
             n=n/10;
         }

         return counter;
    }
}
