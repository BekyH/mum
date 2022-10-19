public class complete {
    public static void main(String[] args) {
     int [] arr = {2, 6, 3, 4,5};
     System.out.println(isComplete(arr));
    }
    public static  int isComplete(int [] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(num%2==0){
                min = Math.min(min,num);
                max = Math.max(max,num);
            }
        }

        if(min==max || min==Integer.MAX_VALUE || max==Integer.MIN_VALUE){
           return 0;
        }
        boolean is_found = false;
        for(int i=min;i<max;i++){
            is_found = false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){

                    is_found = true;
                }
            }
            if(!is_found){
                return 0;
            }
        }

        return 1;
    }
}
