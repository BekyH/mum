public class balanced {
    public static void main(String[] args) {
      int [] arr={-5, 2, -2,-5};
      System.out.println(isBalanced(arr));
    }

    //question
    /**. A balanced array is defined to be an array where for every value n in the array, -n also is in the
     array. For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not
     because 5 is not in the array.
     Write a function named isBalanced that returns 1 if its array argument is a balanced array.
     Otherwise it returns 0.**/
    public static  int isBalanced(int [] arr){
        boolean is_found = false;
        for(int i=0;i<arr.length;i++){
            is_found = false;
            int num = -1 * arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]==num){
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
