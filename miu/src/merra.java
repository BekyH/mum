public class merra {

    public static void main(String[] args) {
        int [] arr = {2, 8, 7, 10, -4, 6};
        System.out.println(isMerra(arr));
    }
    // question
    /**
     * A Meera array is defined to be an array that contains at least one odd number and begins and ends with
     * the same number of even numbers.
     * So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Meera array because it begins with three even numbers and
     * ends with three even numbers and it contains at least one odd number
     * The array {2, 4, 6, 8, 6} is not a Meera array because it does not contain an odd number.
     * The array {2, 8, 7, 10, -4, 6} is not a Meera array because it begins with two even numbers but ends with three
     * even numbers.
     * Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise, it returns 0.**/
    public static  int isMerra(int [] arr){
        if(arr.length<3){
            return 0;
        }
        if(arr[0]%2!=0 || arr[arr.length-1]%2!=0){
            return 0;
        }
           int counter = 0;
           int counter2 = 0;
           int oddindex = 0;
           for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    counter++;
                }
                else {
                    oddindex = i;
                    break;
                }
           }
           for(int j=oddindex+1;j<arr.length;j++){
                 if(arr[j]%2==0){
                     counter2++;
                 }
                 else {
                     counter2 = 0;
                 }
           }

           return counter2==counter?1:0;
    }
}
