public class inertia {
    public static void main(String[] args) {

        int [] arr = {12, 11, 4, 9, 2, 3, 10};
            System.out.println(isInertia(arr));
    }
    public static int isInertia(int [] arr){
        boolean is_odd = false;
        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(num%2==1){
                is_odd = true;
            }
            max = Math.max(num,max);
        }
        if(!is_odd || max%2==1){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                for(int j=0;j<arr.length;j++){
                    if(arr[j]%2==0 && arr[i]<arr[j] && arr[j]!=max){
                        return 0;
                    }
                }
            }
        }

        return 1;
    }
}
