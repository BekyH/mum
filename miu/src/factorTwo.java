public class factorTwo {
    public static void main(String[] args) {
     int n = 48;
     System.out.println(factor(n));
    }

    //question
    /* *Write a function named factorTwoCount that returns the number of times that 2 divides the
argument.
For example, factorTwoCount(48) returns 4 because
48/2 = 24
24/2 = 12
12/2 = 6
6/2 = 3
2 does not divide 3 evenly.
Another example: factorTwoCount(27) returns 0 because 2 does not divide 27.**/
    public static int factor(int n){
        int counter = 0;
        while(n%2==0){
            counter++;
            n = n/2;
        }

        return counter;
    }
}
