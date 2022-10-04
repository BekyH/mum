public class meeraa {

    public static void main(String[] args) {
            int n = 21;
            System.out.println(isMerra(n));
    }

    public static int isMerra(int n){
      int counter = 0;
      for(int i=2;i<n;i++){
          if(n%i==0){
              counter++;
          }
      }
      return  n%counter==0?1:0;
    }
}
