public class Twinoidd {
    public static void main(String[] args) {
        int [] arr = {3, 8, 2,3, 2, 3};
        System.out.println(isTwin(arr));
    }
    //question
    /** A twinoid is defined to be an array that has exactly two even values that are adjacent to one another. For example {3, 3,
     2, 6, 7} is a twinoid array because it has exactly two even values (2 and 6) and they are adjacent to one another. The
     following arrays are not twinoid arrays.
     {3, 3, 2, 6, 6, 7} because it has three even values.
     {3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another
     {3, 8, 5, 7, 3} because it has only one even value.
     Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise it returns 0.**/
    public static int isTwin(int [] arr){
        boolean is_found = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                if(!is_found && i+1<arr.length && arr[i+1]%2==0){
                    is_found = true;
                    i++;
                }
                else{
                    return 0;
                }
            }
        }

        return  is_found? 1:0;
    }
}
