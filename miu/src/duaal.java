public class duaal {
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        System.out.println(isDual(arr));
    }
    //question
    /** An array is said to be dual if it has an even number of elements and each pair of consecutive even and odd elements
     sum to the same value. Write a function named isDual that accepts an array of integers and returns 1 if the array is dual, otherwise it
     returns 0. Examples: {1, 2, 3, 0} is a dual array (because 1+2 = 3+0 = 3), {1, 2, 2, 1, 3, 0} is a dual array (because 1+2 = 2+1 = 3+0 = 3),
     {1, 1, 2, 2}</td> is not a dual array (because 1+1 is not equal to 2+2), {1, 2, 1}</td> <td> is not a dual array (because array does not
     have an even number of elements), {} is a dual array.**/
    public static int isDual(int [] arr){
        int n = arr.length;
        if(n%2!=0){
            return 0;
        }
        int prev_sum = arr[0]+arr[1];
        int curr_sum = 0;
        for(int i=2;i<n;i+=2){
            curr_sum = arr[i] + arr[i+1];
            if(curr_sum!=prev_sum){
                return 0;
            }
        }

        return 1;
    }
}
