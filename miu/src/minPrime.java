public class minPrime {
    public static void main(String[] args) {
   System.out.println(minPrimeDistance(2));
    }

    //question
    /** Write a function named minPrimeDistance that returns the smallest distance between
     two prime factors of a number. For example, consider 13013. Its prime factors are 1, 7, 11, 13 and
     13013. minPrimeDistance(13013) would return 2 because the smallest distance between any
     two prime factors is 2 (13 - 11 = 2). As another example, minPrimeDistance (8) would return 1 because the prime factors of 8 are 1, 2 and the smallest distance between any two factors is 1 (2 - 1 =
     1). Note: Consider 1 as a prime number.**/
    public static int minPrimeDistance(int n){
      int min = Integer.MAX_VALUE;
      for(int i=1;i<=n;i++){
          if(isPrime(i) && n%i==0){
             for(int j=1;j<=n;j++){
                 if(isPrime(j) && i!=j &&n%j==0 ){
                     min = Math.min(Math.abs(i-j),min);
                 }
             }
          }
      }
      return min;
    }
    public  static boolean isPrime(int n){
        if(n<=2){
           return true;
        }

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
       return true;
    }
}
