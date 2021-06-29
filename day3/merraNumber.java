public class merraNumber {
    public static void main(String[] args) {
        int n=30;
        System.out.println(isMeera(n));
    }
    public static int isMeera(int n){
        int num_trival_factors=0;
        int m=n/2;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                num_trival_factors++;
            }
        }
        if(num_trival_factors!=0 &&n%num_trival_factors==0){
            return 1;
        }
        return 0;
    }
}
