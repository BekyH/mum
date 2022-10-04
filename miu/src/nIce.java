public class nIce {
    public static void main(String[] args) {
   int [] arr = {3, 4, 5, 1};
   System.out.println(isNice(arr));

    }
    // question
    /** A Nice array is defined to be an array where for every value n in the array, there is also an element n-1 or
     n+1 in the array.*/
    public static int isNice(int [] arr){
        boolean isFound = false;
          for(int i=0;i<arr.length;i++){
              int num = arr[i]+1;
              int num2 = arr[i]-1;
              isFound = false;
              for (int j=0;j<arr.length;j++){
                  if(arr[j] == num || arr[j]==num2){
                      isFound = true;

                  }
              }
              if(!isFound){
                  return 0;
              }
          }

          return 1;
    }
}
