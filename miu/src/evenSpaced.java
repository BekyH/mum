public class evenSpaced {
    public static void main(String[] args) {
    int [] arr = {180, -56, 11, -81};
    System.out.println(isEvenSpace(arr));
    }

    //question
    /** An integer array is said to be evenSpaced, if the difference between the largest value and the smallest
     value is an even number. Write a function isEvenSpaced(int[] a) that will return 1 if it is evenSpaced and 0
     otherwise. If array has less than two elements, function will return 0**/
    public static int isEvenSpace(int [] arr){
        if(arr.length<2){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num:arr){
            max = Math.max(max,num);
            min = Math.min(min,num);

        }
        int diff = max-min;
        if(diff%2==0){
            return 1;
        }

        return 0;
    }
}
