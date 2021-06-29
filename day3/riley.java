public class riley {
    public static void main(String[] args) {
        int n= 2426;
        System.out.println(isRiley(n));
    }
    public static int isRiley(int n){
        while(n>0){
            int digit = n%10;
            if(digit%2==0){

            }
            else{
                return 0;
            }
            n = n/10;
        }

        return 1;
    }
}
