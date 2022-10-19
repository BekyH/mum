public class primeProduct {
    public static void main(String[] args) {
     int n=21;
     System.out.println(isPrimeProduct(n));
    }
    // question
    /** A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For
     example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
     Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a
     primeproduct, otherwise it returns 0. Recall that a prime number is a positive integer with no factors
     other than 1 and itself.**/
    public  static int isPrimeProduct(int n){
         for(int i=2;i<n;i++){
             if(n %i==0 && isPrime(i)){
                 for(int j=2;j<n;j++){
                        if( n %j==0 && isPrime(j)){
                            if(i*j==n){
                                return 1;
                            }
                        }
                 }
             }
         }
         return 0;
    }
    public static boolean isPrime(int n){
        if(n<2){
           return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
