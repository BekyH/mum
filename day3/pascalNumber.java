public class pascalNumber{
    public static void main(String[] args){
        int n = 91;
        System.out.println(isPascal(n));        
    }
    public static int isPascal(int n){
        boolean is_pascal = false;
        int sum = 0;
        for(int i=1;i<n;i++){
            sum = sum+i;
            if(sum==n){
                is_pascal  = true;
                break;
            }
            else if(sum>n){
                is_pascal = false;
                break;
            }
            }
            if(is_pascal){
                return 1;
            }
            return 0;
        }
    }
