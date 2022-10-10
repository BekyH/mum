public class smera {
    public static void main(String[] args) {
        int [] arr={1, 1, 0, 8, 0, 9, 9,
                1};
        System.out.println(isMara(arr));
    }
    // question
    /** A Meera array is an array that contains the value 1 if and only if it contains 9. The array {7, 9, 0, 10, 1} is a
     Meera array because it contains 1 and 9. The array {6, 10, 8}is a Meera array because it contains no 1 and
     also contains no 9.
     The array {7, 6, 1} is not a Meera array because it contains 1 but does not contain a 9. The array {9, 10,
     0} is not a Meera array because it contains a 9 but does not contain 1.
     108It is okay if a Meera array contains more than one value 1 and more than one 9, so the array {1, 1, 0, 8, 0, 9, 9,
     1} is a Meera array.**/
    public static int isMara(int [] arr){
        boolean isOne = false;
        boolean isNine = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                isOne = true;
            }
            else if(arr[i]==9){
                isNine = true;
            }
        }
        if((isOne && isNine) ||(!isNine && !isOne)){
            return 1;
        }
       return 0;
    }

}
