public class paired {
    public static void main(String[] args) {

        int [] arr = {17,6,3,4};
        System.out.println(isPaired(arr));
    }
     //question
    /**An array a is called paired if its even numbered elements (a[0], a[2], etc.) are odd and its odd numbered
     elements (a[1], a[3], etc.) are even. Write a function namedisPaired that accepts an array of integers and returns 1 if the
     array is paired, otherwise it returns 0. Examples: {7, 2, 3, 6, 7} is paired since a[0], a[2] and a[4] are odd, a[1] and a[3]
     are even. {7, 15, 9, 2, 3} is not paired since a[1] is odd. {17, 6, 2, 4} is not paired since a[2] is even.**/
    public static int isPaired(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(i %2==0 && arr[i]%2==0){
                return 0;
            }
            else if(i%2!=0 && arr[i]%2!=0){
                return 0;
            }
            else {

            }
        }
        return 1;
    }
}
