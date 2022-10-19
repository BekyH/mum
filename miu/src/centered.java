public class centered {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1, 1, 4,6};
          System.out.println(isCentered(arr));
    }
    //question
    /** An array with an odd number of elements is said to be centered if all elements (except the middle
     one) are strictly greater than the value of the middle element. Note that only arrays with an odd
     number of elements have a middle element. Write a function named isCentered that accepts an
     integer array and returns 1 if it is a centered array, otherwise it returns 0.**/
    public static int isCentered(int [] arr){
        if(arr.length%2==0){
            return 0;
        }
         int midindex= arr.length/2;
         int mid = arr[midindex];
        // System.out.println(mid);
         for(int i=0;i<arr.length;i++){
            if(mid>=arr[i] && midindex!=i){
                return 0;
            }
         }

         return 1;
    }
}
