public class fill {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5, 9, 12,-2,-1};
        int k = 3;
        int [] res = fillArr(arr,k,arr.length);
        for(int num : res){
            System.out.print(num + " ");
        }

    }
    //question
    /** Write a function fill with signature
     int[ ] fill(int[ ] arr, int k, int n)
     which does the following: It returns an integer array arr2 of length n whose first k elements are the same as the
     first k elements of arr, and whose remaining elements consist of repeating blocks of the first k elements. You
     can assume array arr has at least k elements. The function should return null if either k or n is not positive.
     Examples:
     fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}.
     fill({4, 2, -3, 12}, 1, 5) returns {4, 4, 4, 4, 4}.
     fill({2, 6, 9, 0, -3}, 0, 4) returns null.
     **/
    public static int[] fillArr(int [] arr,int k, int n){
         if(k<=0 || n<=0){
            return new int[0];
         }
         for(int i=k;i<n;i++){
             arr[i] = arr[i-k];
         }


         return arr;
    }
}
