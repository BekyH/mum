public class otherMerra {
    public static void main(String[] args) {
        int [] arr = {3,7,0,8,0,5};
        System.out.println(ismera(arr));
    }

    //question
    /**  . A Meera array is an array that contains the value 0 if and only if it contains a prime number. The array {7,
     6, 0, 10, 1} is a Meera array because it contains a prime number (7) and also contains a 0. The array {6, 10, 1}
     is a Meera array because it contains no prime number and also contains no 0.
     97The array {7, 6, 10} is not a Meera array because it contains a prime number (7) but does not contain a 0. The
     array {6, 10, 0} is not a Meera array because it contains a 0 but does not contain a prime number.
     It is okay if a Meera array contains more than one value 0 and more than one prime, so the array {3, 7, 0, 8, 0,
     5} is a Meera array (3, 5 and 7 are the primes and there are two zeros.).
     Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 otherwise.   **/
    public static int ismera(int [] arr){
        boolean zero = hasZero(arr);
        boolean prime = hasPrime(arr);
        if(zero && prime){
            return 1;
        }
        if(!zero && !prime){
            return 1;
        }

        return 0;
    }
    public  static boolean hasZero(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return true;
            }
        }
        return false;
    }
    public static boolean hasPrime(int [] arr){
         for(int i=0;i<arr.length;i++){
                if(isPrime(arr[i])){
                    return true;
                }
         }
         return false;
    }

    public static boolean isPrime(int n){
        if(n<2){
           return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
