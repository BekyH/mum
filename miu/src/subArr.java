public class subArr {
    public static void main(String[] args) {
       int [] arr = {11, 5, 3, 2};
       System.out.println(isSub(arr));
    }

    //question
    /** An Sub array is defined to be an array in which each element is greater than sum of all elements after
     that. See examples below:
     {13, 6, 3, 2} is a Sub array. Note that 13 > 2 + 3 + 6, 6 > 3 + 2, 3 > 2.
     {11, 5, 3, 2} is a NOT a Sub array. Note that 5 is not greater than 3 + 2.
     Write a function named isSub that returns 1 if its array argument is a Sub array, otherwise it returns 0.**/
    public static int isSub(int [] arr){
        int sum = 0;
        for(int num:arr){
            sum = sum + num;
        }
        for(int i=0;i<arr.length-1;i++){
            int num = arr[i];
            sum= sum - num;
            if(num>sum){
                continue;
            }
            else {
                return 0;
            }
        }
        return 1;
    }
}
