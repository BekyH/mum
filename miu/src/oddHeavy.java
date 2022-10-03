public class oddHeavy {
    public static void main(String[] args) {
     int [] arr = {2, -4, -6, -8, -11};
     System.out.println(isOddHeavy(arr));
    }
    //question
    /** An array is defined to be odd-heavy if it contains at least one odd element and every odd element is
     greater than every even element. So {11, 4, 9, 2, 8} is odd-heavy because the two odd elements (11 and 9) are greater than
     all the even elements. And {11, 4, 9, 2, 3, 10} is not odd-heavy because the even element 10 is greater than the odd
     element 9. Write a function called isOddHeavy that accepts an integer array and returns 1 if the array is odd-heavy;
     otherwise it returns 0. Some other examples: {1} is odd-heavy, {2} is not odd-heavy, {1, 1, 1, 1} is odd-heavy, {2, 4, 6,
     8, 11} is odd-heavy, {-2, -4, -6, -8, -11} is not odd-heavy.**/
    public static int isOddHeavy(int [] arr){
            boolean odd_found = false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2!=0){
                    int num = arr[i];
                    odd_found = true;
                    for(int j=0;j<arr.length;j++){
                        if(arr[j]%2==0 && arr[j]>num){
                            return 0;
                        }
                    }
                }
            }

            return odd_found? 1:0;
    }
}
