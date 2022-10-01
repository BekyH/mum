public class twinoid {
    public static void main(String[] args) {
     int [] arr = {8,8,9,8,8,5};
     System.out.println(isTwinoid(arr));
    }
    // question
    /**A twinoid is defined to be an array that has exactly two even values that are adjacent to one
     another. For example {3, 3, 2, 6, 7} is a twinoid array because it has exactly two even values (2 and
     6) and they are adjacent to one another. The following arrays are not twinoid arrays.
     {3, 3, 2, 6, 6, 7} because it has three even values.
     {3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another
     {3, 8, 5, 7, 3} because it has only one even value.
     Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise
     it returns 0.
     * **/
    public static int isTwinoid(int [] arr){
        boolean evenadjacent = false;
        for(int i=0;i<arr.length;i++){
             if(arr[i]%2==0 && evenadjacent){
                 return 0;
             } else if (arr[i]%2==0 && i+1<arr.length && arr[i+1]%2==0) {
                     evenadjacent = true;
                     i++;
             }
        }

        return evenadjacent? 1:0;
    }
}
