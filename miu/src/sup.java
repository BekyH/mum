public class sup {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(isSuper(arr));
    }
    // question
    /**An Super array is defined to be an array in which each element is greater than sum of all elements before
     that. See examples below:
     {2, 3, 6, 13} is a Super array. Note that 2 < 3, 2+3 < 6, 2 + 3 + 6 < 13.
     {2, 3, 5, 11} is a NOT a Super array. Note that 2 + 3 not less than 5.
     Write a function named isSuper that returns 1 if its array argument is a isSuper array, otherwise it returns 0.**/

    public static int isSuper(int [] a){
        int sum = 0;
        for(int i=0;i<a.length-1;i++){
            sum = sum + a[i];
            if(sum>=a[i+1]){
                return 0;
            }
        }

        return 1;
    }
}
