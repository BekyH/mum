public class bunkerr {
    public static void main(String[] args) {
     int [] arr = {2, 4, 9, 3, 15, 21,1,1};
     System.out.println(is_Bunker(arr));

    }

    //question
    /** A Bunker array is defined to be an array in which at least one odd number is immediately followed by its
     square. So {4, 9, 6, 7, 49} is a Bunker array because the odd number 7 is immediately followed by 49. But
     {2, 4, 9, 3, 15, 21} is not a Bunker array because none of the odd numbers are immediately followed by its
     square.
     Write a function named isBunkerArray that returns 1 if its array argument is a Bunker array, otherwise it
     returns 0.**/
    public static int is_Bunker(int [] arr){
        boolean isbunk = false;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(num%2==0){
                continue;
            }
            int square = num * num;
            if(i+1<arr.length && arr[i+1]==square){
                isbunk = true;
                break;
            }
        }

        return isbunk?1:0;
    }
}
