public class isMra {
    public static void main(String[] args) {
      int [] arr = {1,2,1};
      System.out.println(isMer(arr));
    }
    public static  int isMer(int [] arr){
        boolean isOdd = false;
        for(int num:arr){
            if(num%2!=0){
                isOdd = true;
            }
        }
        if(!isOdd){
           return 0;
        }
        int counter = 0;
        for(int num:arr){
            if(num%2==0){
                counter++;
            }
            else{
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2==0){
                counter--;
            }
            else {
                break;
            }
        }
        return counter==0?1:0;
    }
}
