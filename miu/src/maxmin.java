public class maxmin {
    public static void main(String[] args) {
        int [] arr ={-2, -4, -6, -8, -11,-2};
        System.out.println(maxminEqual(arr));
    }

    //question
    /**
     An array is defined to be maxmin equal if it contains at least two different elements and the number of
     times the maximum value occur is the same as the number of times the minimum value occur. So {11, 4, 9, 11,
     8, 5 , 4, 10} is maxmin equal, because the max value 11 and min value 4 both appear two times in the array.
     Write a function called isMaxMinEqual that accepts an integer array and returns 1 if the array
     is maxmin equal; otherwise it returns 0.
     If you are programming in Java or C#, the function signature is
     int isMaxMinEqual(int[ ] a)
     If you are programming in C or C++, the function signature is
     int isMaxMinEqual(int a[ ], int len) where len is the number of elements in the array
     examples
     {} return 0 because there must be at least 2 distinct elements
     {2} return 0 because there must be at least 2 distinct elements

     {2, 4, 6, 8, 11} return 1
     {-2, -4, -6, -8, -11} return 1

     **/
    public static  int maxminEqual(int [] arr){
        if(arr.length<2){
            return 0;
        }
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int maxoccur = 0;
      int minoccur = 0;
      for(int num:arr){
          max = Math.max(max,num);
          min = Math.min(min,num);

      }
      if(min==max){
          return 0;
      }
      for (int num:arr){
          if(num==max){
              maxoccur++;
          }
          else if(num==min){
              minoccur++;
          }
      }

      return  maxoccur==minoccur? 1:0;
    }
}
