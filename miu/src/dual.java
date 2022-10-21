public class dual {
    public static void main(String[] args) {
    int [] arr = {3, 1, 1, 2, 2,3};
    // question
        /** Define a Dual array to be an array where every value occurs exactly twice.
         For example, {1, 2, 1, 3, 3, 2} is a dual array.
         The following arrays are not Dual arrays
         {2, 5, 2, 5, 5} (5 occurs three times instead of two times)
         {3, 1, 1, 2, 2} (3 occurs once instead of two times)
         Write a function named isDual that returns 1 if its array argument is a Dual array. Otherwise it returns
         0.**/
    System.out.println(isDual(arr));
    }

    public static int isDual(int [] arr){
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            counter=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            if(counter!=2){
                return 0;
            }
        }

        return 1;
    }
}
