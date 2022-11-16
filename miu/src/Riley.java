public class Riley {
    public static void main(String[] args) {
        int n = 44445;
        System.out.println(isRiley(n));

    }

    public static int isRiley(int n){
        while(n>0){
            int x = n%10;
            if(x%2!=0){
                return 0;
            }
            n = n/10;
        }

        return 1;
    }

}
