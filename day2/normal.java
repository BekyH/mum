public class normal {
    public static int isNormal(int n){
        for(int i=2;i<n;i++){
             if(i%2!=0 && n%i==0){
                return 0;
             }   
        }

        return 1;
    }
    public static void main(String[] args){
        int n=12;
        System.out.println(isNormal(n));

    }
}