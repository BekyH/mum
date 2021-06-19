public class balanced{
    public static int balanced(int[] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            if((i%2==0 && a[i]%2==0)||(i%2!=0 && a[i]%2!=0 )){
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        int [] a = {6,7,2,3,12};
        System.out.println(balanced(a));
    }
}