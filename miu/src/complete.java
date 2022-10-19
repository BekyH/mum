public class complete {
    public static void main(String[] args) {
     int [] arr = {2, 6, 3, 4,5};
     System.out.println(isComplete(arr));
    }

    //question
    /** An array is defined to be complete if the conditions (a), (d) and (e) below hold.
     a. The array contains even numbers
     b. Let min be the smallest even number in the array.
     c. Let max be the largest even number in the array.
     d. min does not equal max
     e. All numbers between min and max are in the array
     For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because
     a. The array contains even numbers
     b. 2 is the smallest even number
     c. 8 is the largest even number
     d. 2 does not equal 8
     e. the numbers 3, 4, 5, 6, 7 are in the array.
     Examples of arrays that are not complete are:
     {5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
     {2, 2} condition (d) does not hold
     {2, 6, 3, 4} condition (e) does not hold (5 is missing)
     Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise
     it returns 0.**/
    public static  int isComplete(int [] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(num%2==0){
                min = Math.min(min,num);
                max = Math.max(max,num);
            }
        }

        if(min==max || min==Integer.MAX_VALUE || max==Integer.MIN_VALUE){
           return 0;
        }
        boolean is_found = false;
        for(int i=min;i<max;i++){
            is_found = false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){

                    is_found = true;
                }
            }
            if(!is_found){
                return 0;
            }
        }

        return 1;
    }
}
