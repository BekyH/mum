public class countmax {

    public static void main(String[] args){
        int [] a = {1,2,3,4,5,3,5,2,4,5,3,4};
        System.out.println(Maxcount(a));
    }
    public static int Maxcount(int[] a){
        int maxval = Integer.MIN_VALUE;
        
        for(int i=0;i<a.length;i++){
            if(a[i]>maxval){
                maxval = a[i];
                
            }
        }
        int counter=0;
        for(int i=0;i<a.length;i++){
            if(maxval==a[i]){
                counter++;
            }
        }
        return counter;
    }
}
