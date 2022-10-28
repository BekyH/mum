public class sumDigit {
    public static void main(String[] args) {
        int n =65943943;
        System.out.println(sumDig(n));
    }
    //question
    /** Write a function named sumDigits that sums the digits of its integer argument. For example
     sumDigits(3114) returns 9, sumDigits(-6543) returns 18 and sumDigits(0) returns 0.*/
    public static int sumDig(int n){
        int sum = 0;
        n = Math.abs(n);
        while(n>0){
            int x = n%10;
            sum = sum + x;
            n = n/10;
        }

        return sum;
    }
}
