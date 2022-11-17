public class lastEven {
    public static void main(String[] args) {
      int [] arr = {2,1,1,1,2};
      System.out.println(isLastEven(arr));

    }
    // question
    /**Write a function named lastEven that returns the index of the last even value in its
     array argument. For example, lastEven will return 3 if the array is {3, 2, 5, 6,
     7}, because that is the index of 6 which is the last even value in the array.
     If the array has no even numbers, the function should return -1.
     *
     * **/
    public static int isLastEven(int [] arr){
        int n = arr.length;
        int lastIndex = -1;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
