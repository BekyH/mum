public class pascal {
    public static void main(String[] args) {
     int n = 34;
     System.out.println(isPascal(n));
    }

    //question
    /** A Pascal number is a number that is the sum of the integers from 1 to j for some j. For
     example 6 is a Pascal number because 6 = 1 + 2 + 3. Here j is 3. Another Pascal number
     is 15 because 15 = 1 + 2 + 3 + 4 + 5. An example of a number that is not a Pascal number
     is 7 because it falls between the Pascal numbers 6 and 10.
     Write a function named isPascal that returns 1 if its integer argument is a Pascal number,
     otherwise it returns 0.**/
    public static  int isPascal(int n){
        int sum = 0;
             for(int i=1;i<n;i++){
                 sum = sum +i;
                 if(sum==n){
                     return 1;
                 }
                 if(sum>n){
                     break;
                 }
             }

       return 0;
    }
}
