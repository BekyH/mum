public class minDistance {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(mindistance(n));
    }
    public static int mindistance(int n){
        int min = Integer.MAX_VALUE;
        int prev_factor = 1;
        int m = n/2;
        for(int i=2;i<=m;i++){
            if(n%i==0){
             int current_factor = i;
             int distance = current_factor-prev_factor;
             min = Math.min(min,distance);
             prev_factor = current_factor;       
            }
        }
        return min;
    }
}
