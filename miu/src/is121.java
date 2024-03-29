    public class is121 {
    public static void main(String[] args) {

        int [] arr = {2, 2, 2, 1, 1, 1, 2, 2, 2,
                1, 1};
        System.out.println(is121Array(arr));
    }
    // question
        /**Define an array to be a 121 array if all its elements are either 1 or 2 and it begins with one or more 1s
         followed by a one or more 2s and then ends with the same number of 1s that it begins with. Write a method
         named is121Array that returns 1 if its array argument is a 121 array, otherwise, it returns 0.
         If you are programming in Java or C#, the function signature is
         int is121Array(int[ ] a)
         If you are programming in C or C++, the function signature is
         int is121Array(int a[ ], int len) where len is the number of elements in the array a.
         examples
         [1,2,1]     return 1  because the same number of 1s are at the beginning and end of the array and there is at least one 2 in between them.
         [1,1,2,2,2,1,1] return 1 because the same number of 1s are at the beginning and end of the array and there is at least one 2 in between them.
         {1, 1, 2, 2, 2, 1, 1, 1} return 0 Because the number of 1s at the end does not equal the number of 1s at the beginning.
         {1, 1, 2, 1, 2, 1, 1} return 0 Because the middle does not contain only 2s.
         {1, 1, 1, 2, 2, 2, 1, 1, 1,3} return 0 Because the array contains a number other than 1 and 2.
         {1, 1, 1 , 1, 1, 1} return 0 Because the array does not contain any 2s
         {2,1,2,1} return 0 Because the first element of the array is not a 1.
         {1,2,1,2} return 0 Because the last element of the array is not a 1.
         {2, 2, 2} return 0 Because there is no 1s in the array.
         **/

    public static int is121Array(int[] a){
        int counter = 0;
        boolean begin = true;
        boolean end = false;
        for(int num:a){
            if(num==1){
                if(begin){
                    counter++;
                }
                else {
                    end = true;
                    counter--;
                }
            }
            else if(num==2 && !end && counter>0){
                begin = false;
            }
            else {
                return 0;
            }
        }

        return counter==0?1:0;
    }
}
