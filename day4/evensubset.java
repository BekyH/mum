import java.util.*;

public class evensubset{
    public static void main(String[] args){
        int m=20;
        int n=10;
        System.out.println(isEvenSubset(m, n));
    }
    public static int isEvenSubset(int m,int n){
        int x = m/2;
        for(int i=2;i<x;i++){
            if(m%i==0 && i%2==0){
                if(n%i==0){
         }
                else{
                    return 0;
                }        
            }
        }
        return 1;
    }
}