public class Main {
    public static void main(String[] args) {
        int n = 128;
        int p = 4;
        System.out.println(getExponent(n,p));
    }
    public static int getExponent(int n, int p){
        if(p<=1){
            return -1;
        }
        int x = 0;
        while (n%p==0){

            n = n/p;
            x++;
        }

        return x;
    }
}