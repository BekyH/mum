public class wave {
    public static void main(String[] args) {
     int[] a = {2,6,3,4};
     System.out.println(isWave(a));

    }
    public static int isWave(int[] a){
        for(int i=1;i<a.length;i++){
                if(a[i-1]%2==0 && a[i]%2==0){
                    return 0;
                }
                else if(a[i-1]%2!=0 && a[i]%2!=0){
                    return 0;
                }
                else{

                }
        }
        return 1;
    }

}
