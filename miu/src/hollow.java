public class hollow {
    public static void main(String[] args) {
     int [] arr = {1,0,1};
     System.out.println(isHollow(arr));
    }
    // question
    /**
     * An array is said to be hollow if it contains 3 or more zeros in the middle that are preceded and followed by
     * the same number of non-zero elements. Write a function named isHollow that accepts an integer array and returns 1 if it is
     * a hollow array, otherwise it returns 0. The function signature is
     * int isHollow(int[ ] a).
     * Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns true. isHollow ({1,2,0,0,0,3,4,5}) returns false. : isHollow ({1,2,4,9,
     * 0,0,0,3,4, 5}) returns false. isHollow ({1,2, 0,0, 3,4}) returns false.**/
    public static boolean isHollow(int [] arr){
        int n = arr.length;
        if(n<3){
            return false;
        }
        int mid = n/2;
        if(arr[mid-1]!=0 || arr[mid]!=0 || arr[mid+1]!=0){
            return false;
        }
        int precededcounter = 0;
        int followedcouter = 0;
        for(int i=0;i<mid-1;i++){
            if(arr[i]!=0){
                precededcounter++;
            }
        }
        for(int i=mid+2;i<n;i++){
            if(arr[i]!=0){
                followedcouter++;
            }
        }

        return followedcouter==precededcounter;
    }
}
