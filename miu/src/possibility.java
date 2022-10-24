public class possibility {
    public static void main(String[] args) {
      int [] arr = {0,1,2,3,4,5,6,7,8,9};
      System.out.println(isPossible(arr));
    }
    //question
    /** A non-empty array of length n is called an array of all possibilities, if it contains all numbers between 0 and n - 1
     inclusive. Write a method named isAllPossibilities that accepts an integer array and returns 1 if the array is an array of all
     possibilities, otherwise it returns 0. Examples {1, 2, 0, 3} is an array of all possibilities, {3, 2, 1, 0} is an array of all possibilities, {1, 2, 4,
     3} is not an array of all possibilities, (because 0 not included and 4 is too big), {0, 2, 3} is not an array of all possibilities, (because 1 is
     not included), {0} is an array of all possibilities, {} is not an array of all possibilities (because array is empty).**/
    public static int isPossible(int [] arr){
        int n = arr.length;
        boolean is_found = false;
        for(int i=0;i<n;i++){
            is_found = false;
            for(int j=0;j<n;j++){
                if(i==arr[j]){
                    is_found = true;
                    break;
                }
            }
            if(!is_found){
                return 0;
            }
        }

        return 1;
    }
}
