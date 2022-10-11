public class ban {
    public static void main(String[] args) {
      int [] arr = {4,9};
      System.out.println(isBean(arr));
    }
    public static int isBean(int [] arr){
        boolean is_found = false;
        for(int i=0;i<arr.length;i++){
            is_found = false;
             int num = arr[i];
             for(int j=0;j<arr.length;j++){
                 if(i==j){

                 }
                 else {
                     int num1 = 2 * num;
                     int num2 = num/2;
                     int num3 = (2*num) + 1;
                     if(num1 == arr[j] || num2 ==arr[j] || num3==arr[j]){
                         is_found = true;
                     }
                 }

             }
             if(!is_found){
                 return 0;
             }

        }

        return is_found? 1:0;
    }
}
