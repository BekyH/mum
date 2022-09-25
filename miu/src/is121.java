    public class is121 {
    public static void main(String[] args) {

        int [] arr = {2, 2, 2, 1, 1, 1, 2, 2, 2,
                1, 1};
        System.out.println(is121Array(arr));
    }
    public static int is121Array(int[] a){
        int counter = 0;
        boolean begin = true;
        boolean end = false;
        for(int num:a){
            if(num==1){
                if(begin){
                    counter++;
                }
                else {
                    end = true;
                    counter--;
                }
            }
            else if(num==2 && !end && counter>0){
                begin = false;
            }
            else {
                return 0;
            }
        }

        return counter==0?1:0;
    }
}
