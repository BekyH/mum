import java.util.*;
public class suff {
    public static void main(String[] args) {
        int[] a = {2,3,4};
        System.out.println(isSuff(a));
    }
    public static int isSuff(int[] a){
        Set<Integer> set = new HashSet<>();
        for(int i:a){
            set.add(i);

        }
        for(int x:a){
        int y = x+1;
        int z = x-1;
        if(set.contains(y) || set.contains(z)){

        }
        else{
            return 0;
        }
        }
       return 1; 
    }
}
