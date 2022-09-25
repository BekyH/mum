public class Main {
    public static void main(String[] args) {
        int n = 128;
        int p = 4;
        System.out.println(getExponent(n,p));
    }

    // question
    /**1. Write a method named getExponent(n, p) that returns the largest exponent x such that p x evenly divides n.
     If p is <= 1 the method should return -1.
     For example, getExponent(162, 3) returns 4 because 162 = 2 1 * 3 4 , therefore the value of x here is 4.
     The method signature is
     int getExponent(int n, int p)
     examples
    n = 27 p = 3, return 3 because 3^3 divides 27 evenly but 3^4 does not.
     n = 28,p = 3, return 0 because 3^0 divides 28 evenly but 3^1 does not.
     n= 280, p = 7, return 1 because 7^1 divides 280 evenly but 7^2 does not.


     **/

    public static int getExponent(int n, int p){
        if(p<=1){
            return -1;
        }
        int x = 0;
        while (n%p==0){

            n = n/p;
            x++;
        }

        return x;
    }
}