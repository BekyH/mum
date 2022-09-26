public class Bunker {
    public static void main(String[] args) {
        int [] a = {4, 9, 6, 7, 3};
        int [] b = {4, 9, 6, 15, 21};
        System.out.println(isBunkerArray(b));
    }
    //question
    /**
     A Bunker array is defined to be an array in which at least one odd number is immediately followed by a prime
     number. So {4, 9, 6, 7, 3} is a Bunkerarray because the odd number 7 is immediately followed by the prime
     number 3. But {4, 9, 6, 15, 21} is not a Bunker array because none of the oddnumbers are immediately followed by
     a prime number.
     Write a function named isBunkerArray that returns 1 if its array argument is a Bunker array, otherwise it returns 0.
     If you are programming in Java or C#, the function signature is
     int isBunkerArray(int [ ] a)
     If you are programming in C or C++, the function signature is
     int isBunkerArray(int a[ ], int len) where len is the number of elements in the array.**/


    public static int isBunkerArray(int [] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            if(a[i]%2==1){
                if(i+1<n && isPrime(a[i+1])==1){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static  int isPrime(int a){
        if(a<2){
            return 0;
        }
        if(a==2){
            return 1;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return 0;
            }
        }
        return 1;
    }
}
