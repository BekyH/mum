public class merra{
    public static void main(String[] args){
           int[] a = {3,7,1,8};
           System.out.println(isMeera(a));
    }
  public static int isMeera(int[] a){
      boolean isprime = false;
      boolean isone = false;
      for(int i:a){
          if(i==1){
            isone = true;
          }
          
       else{
            if(isPrime(i)){
                isprime = true;
                
            }
            
       }
       if(isone && isprime){
            return 1;
       }
      }

      return 0;
  } 
  public static boolean isPrime(int n){
      int m = n/2;
    if(n==0||n==1){  
        return false;   
       }
       else{  
        for(int i=2;i<=m;i++){      
         if(n%i==0){      
            return false;      
            
         }      
        }   

  }
  return true;  
}
}