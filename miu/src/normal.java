public class normal {

    public static void main(String[] args) {
      int n = 18;
      System.out.println(isNormal(n));
    }

    //question
    /** A normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
     Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0. The
     function signature is
     int isNormal(int n)
     Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd factor. 10 is
     not a normal number since 5 is an odd factor.**/
    public static int isNormal(int n){
        for(int i=3;i<n;i++){
            if(i%2!=0 && n%i==0){
                return 0;
            }
        }

        return 1;
    }
}
