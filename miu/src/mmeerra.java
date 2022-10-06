public class mmeerra {
    public static void main(String[] args) {
     int [] arr = {8, 3, -8};
     System.out.println(isMera(arr));
    }
    //question
    /** A Meera array is defined to be an array such that for all values n in the array, the value -n is not in the array.
     So {3, 5, -2} is a Meera array. But {8, 3, -8} is not a Meera array because forn=8, -n = -8 is in the array.
     Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.**/
    public static int isMera(int [] arr){
      boolean is_mera= true;
      for(int i=0;i<arr.length;i++){
          int num = -1 * arr[i];
          for(int j=0;j<arr.length;j++){
                if(arr[j]==num){
                    is_mera = false;
                    break;
                }
          }
      }

      return is_mera?1:0;
    }

}
