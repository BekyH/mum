public class ksmall {
    public static void main(String[] args) {
     int n = 22;
     int k = 12;
     System.out.println(kSmallFactor(n,k));
    }
    //question
    /** Given a positive integer k, another positive integer n is said to have k-small factors if n can be
     written as a product u*v where u and v are both less than k. For instance, 20 has 10-small factors
     since both 4 and 5 are less than 10 and 4*5 = 20. (For the same reason, it is also true to say that 20
     has 6-small factors, 7-small factors, 8-small factors, etc). However, 22 does not have 10-small
     factors since the only way to factor 22 is as 22 = 2 * 11, and 11 is not less than 10.**/
    public static boolean kSmallFactor(int n,int k){
        for(int i=2;i<k;i++){
            for(int j=2;j<k;j++){
                if(n%i==0 && n%j==0){
                    if(i*j==n){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
