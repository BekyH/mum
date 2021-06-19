public class oddHeavy {
    public static int isOddHeavy(int[] a){
        int min_odd = Integer.MAX_VALUE;
        for(int element:a){
            if(element%2!=0){
                min_odd = Math.min(min_odd,element);
            }
        }
        if(min_odd==Integer.MAX_VALUE){
            return 0;
        }
        for(int elmt:a){
            if(elmt%2==0 && elmt>min_odd){
                return 0;
            }
        }

        return 1;
    }
    public static void main(String[] args){
        int[] a = {-2,-4,6,8,11};
        System.out.println(isOddHeavy(a));
    }
    
}

