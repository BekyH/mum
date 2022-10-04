public class Bunk {

    public static void main(String[] args) {
        int [] arr = {9,10};
        System.out.println(isBunker(arr));
    }
      // question
    /** A Bunker array is an array that contains the value 1 if and only if it contains a prime number. The array {7,
     6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1. The array {7, 6, 10}
     is not a Bunker array because it contains a prime number (7) but does not contain a 1. The array {6, 10, 1}
     is not a Bunker array because it contains a 1 but does not contain a prime number.
     It is okay if a Bunker array contains more than one value 1 and more than one prime, so the array {3, 7, 1, 8, 1}
     is a Bunker array (3 and 7 are the primes). **/
    public static int isBunker(int [] arr){
         boolean has1 = hasOne(arr);
         boolean hasPr = hasPrime(arr);
         if(hasPr && has1){
             return 1;
         }
         else if(!has1 && !hasPr){

             return 1;
         }
         else {
             return 0;
         }
    }

    public static boolean hasOne(int [] arr){
          for(int i=0;i<arr.length;i++){
              if(arr[i]==1){
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
    public static  boolean isPrime(int n){
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
