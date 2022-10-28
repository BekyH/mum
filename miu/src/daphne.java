public class daphne {
    public static void main(String[] args) {
        int [] arr = {1};
        System.out.println(isDaphne(arr));
    }
    //question
    /** A Daphne array is defined to be an array that contains at least one odd number and begins and
     ends with the same number of even numbers.
     So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because it begins with three even
     numbers and ends with three even numbers and it contains at least one odd number
     The array {2, 4, 6, 8, 6} is not a Daphne array because it does not contain an odd number.
     The array {2, 8, 7, 10, -4, 6} is not a Daphne array because it begins with two even numbers but ends
     with three even numbers.
     Write a function named isDaphne that returns 1 if its array argument is a Daphne array. Otherwise, it
     returns 0.**/
    public static int isDaphne(int [] arr){
        boolean is_odd = false;
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                counter++;
            }
            else{
                is_odd = true;
                break;
            }
        }
        if(!is_odd){
            return 0;
        }
        for(int i = arr.length-1;i>=0;i--){
             if(arr[i]%2==0){
                counter--;
             }
             else {
                 break;
             }
        }
        return counter==0?1:0;
    }
}
