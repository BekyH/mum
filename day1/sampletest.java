public class sampletest{
    public static int isCentered(int[] arr){
        int n  = arr.length;
        if(n%2==0){
            return 0;
        }
        int middleIndex = n/2;

        for(int i=0;i<n;i++){
            if(i!=middleIndex && arr[middleIndex]>=arr[i]){
                return 0;
            }
        }
        return 1;

    }
    public static int intf(int[] a){
        int x = 0;
        int y = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                y = y + a[i];
            }
            else{
                x = x + a[i];
            }

        }
        return x-y;
    }
    
    
}