public class maxDigit {
    public static void main(String[] args) {
     int n = 1234;
     System.out.println(maxOccurDigit(n));
    }

    public  static int maxOccurDigit(int n){
              int num = Math.abs(n);
              int result = -1;
              int max_occur = 0;
              int occur = 0;
              int num1 = num;
              int num2 = num;
              while (num1>0){
                  int x = num1%10;
                  num2 = num;
                  occur = 0;
                  while(num2>0){
                      int y  = num2 %10;
                      if(x==y){
                          occur++;
                      }
                      num2 = num2/10;
                  }

                  if(occur>max_occur){
                      max_occur = occur;
                      result = x;

                  }
                  num1 =num1/10;
              }

              return result;

    }



}
