public class coutMax {
    public static void main(String[] args) {
       int [] arr = {6, 3,
               1, 3, 4, 3, 6, 5};
       System.out.println(countMax(arr));
    }

    //questions
    /** Write a function named countMax that returns the number of times that the max
     value occurs in the array. For example, countMax would return 2 if the array is {6. 3,
     1, 3, 4, 3, 6, 5}because 6 occurs 2 times in the array.**/

    public static int countMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            max = Math.max(max,num);
        }
        int counter = 0;
        for(int num:arr){
            if(max==num){
                counter++;
            }
        }
        return counter;
    }
}
