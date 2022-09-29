public class goodsp {

    public static void main(String[] args) {
    int [] arr = {3, 1, 3 ,1, 3, 5, 5,3};
    System.out.println(goodSpread(arr));
    }

    //question
    /**
     *  Write a function called goodSpread that returns 1 if no value in its array argument occurs more than 3
     * times in the array.
     * For example, goodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9} returns 1 because no value occurs more than three
     * times.
     * But goodSpread(new int[ ] {3, 1, 3 ,1, 3, 5, 5, 3} ) returns 0 because the value 3 occurs four times.**/
    public static int goodSpread(int [] arr){
        int counter = 0;
        boolean isGoodSpread = true;
        for(int i=0;i<arr.length;i++){
         counter = 0;
         for (int j=0;j<arr.length;j++){
             if(arr[i]==arr[j]){
                 counter++;
             }
             if(counter>3){
                 isGoodSpread = false;
                 break;
             }
         }
        }

        return isGoodSpread? 1:0;
    }
}
