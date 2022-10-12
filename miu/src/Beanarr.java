public class Beanarr {
    public static void main(String[] args) {
       int [] arr = {4, 7, 16};
       System.out.println(isBean(arr));
    }
    // question
    /** An array is defined to be a Bean array if it meets the following conditions
     a. If it contains a 9 then it also contains a 13.
     b. If it contains a 7 then it does not contain a 16.
     So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6,
     17} are Beanarrays. The following arrays are not Bean arrays: a. { 9, 6, 18} (contains a 9 but no 13)
     b. {4, 7, 16} (contains both a 7 and a 16)**/
    public static int isBean(int [] arr){
        boolean nine = false;
        boolean thirteen = false;
        boolean seven = false;
        boolean sixteen = false;
        for(int num:arr){
            if(num==9){
                nine = true;
            }
            else if(num==13){
                thirteen = true;
            }
            else if(num==7 && sixteen){
                  return 0;
            }
            else if(num==7){
                seven = true;
            }
            else if(num==16 && seven){
                return 0;
            }
            else if(num==16){
                sixteen = true;
            }
        }
        if((nine && thirteen) || (!nine && !thirteen) || (thirteen && !nine)){
            return 1;
        }
        return 0;
    }
}
