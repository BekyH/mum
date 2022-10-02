public class mode {
    public static void main(String[] args) {
        int [] arr = {7, 1, 2, 1, 7, 4, 2, 7};
        System.out.println(hasSingleMode(arr));
    }
    //question
    /** Mode is the most frequently appearing value. Write a function named hasSingleMode that takes an array
     argument and returns 1 if the mode value in its array argument occurs exactly once in the array, otherwise it
     returns 0. If you are writing in Java or C#, the function signature is
     int hasSingleMode(int[ ] ).
     Examples
     Array elements                    Mode values                     Value returned          comments
     1, -29, 8, 5, -29, 6               -29                                1                      single mode
     1, 2, 3, 4, 2, 4, 7                  2,4                               0                       no single mode
     1, 2, 3, 4, 6                         no                               0                       no single mode
     7, 1, 2, 1, 7, 4, 2, 7,                7                               1                           single mode







     **/
    public static int hasSingleMode(int [] arr){
        int max_occur = 0;
        int num = 0;
        int occur = 0;
        for(int i = 0; i<arr.length;i++){
            occur = 0;
            for(int j=0;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                     occur++;

                }
            }
            if(occur>max_occur){
                max_occur = occur;
                num = arr[i];
            }


        }
        int  curr_occur = 0;
        //System.out.println(max_occur + ":" + num);
        for(int i=0;i<arr.length;i++){
            curr_occur = 0;
            for(int j =0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    curr_occur++;
                }
            }
            if(curr_occur==max_occur && num!=arr[i]){
                return 0;
            }
        }
        return 1;
    }
}
