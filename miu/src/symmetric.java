public class symmetric {
    public static void main(String[] args) {
     int [] arr = {2, 7, 8, 9, 11, 13, 10};
     System.out.println(isSym(arr));
    }
    //question
    /** An isSym (even/odd Symmetric) array is defined to be an array in which even numbers and odd numbers
     appear in the same order from “both directions”. You can assume array has at least one element. See
     examples below:
     {2, 7, 9, 10, 11, 5, 8} is a isSym array.
     Note that from left to right or right to left we have even, odd, odd, even, odd, odd, even.
     {9, 8, 7, 13, 14, 17} is a isSym array.
     Note that from left to right or right to left we have {odd, even, odd, odd, even, odd}.
     However, {2, 7, 8, 9, 11, 13, 10} is not a isSym array.
     From left to right we have {even, odd, even, odd, odd, odd, even}.
     From right to left we have {even, odd, odd, odd, even, odd, even},
     which is not the same.**/
    public static int isSym(int [] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int num1 =arr[left];
            int num2 = arr[right];
            if((num1 %2==0 && num2%2==0) || num1%2!=0 && num2%2!=0){

            }
            else{
                return 0;
            }
            left++;
            right--;
        }
        return 1;
    }
}
