public class fancy {
    public static void main(String[] args) {
        System.out.println(isFancy(773));
    }

    // question
    /** A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first two fancy numbers are 1 and
     any fancy number other than the first two is sum of thethree times previous one and two times the one before
     that. See below:
     1,
     1,
     3*1 +2*1 = 5
     3*5 +2*1 = 17
     3*17 + 2*5 = 61
     Write a function named isFancy that returns 1 if its integer argument is a Fancy number, otherwise it returns 0.**/
    public static  int isFancy(int n){
        if(n<1){
           return 0;
        }
        if(n==1){
           return 1;
        }
        int prev1 = 1;
        int prev2 = 1;
        int curr_num=1;
        while(curr_num<n){
            curr_num = (3 * prev2) + (2 * prev1);
            //System.out.println(curr_num + ":" + prev2 + ":" + prev1);
            if(curr_num==n){
                return 1;
            }
            prev1 = prev2;

            prev2 =curr_num;
        }

        return 0;

    }
}
