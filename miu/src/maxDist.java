public class maxDist {
    public static void main(String[] args) {
    int n= 98;
    System.out.println(maxDistance(n));
    }

    // question
    /**
     * Write a function named maxDistance that returns the largest distance between two non -trivial factors of a
     * number. For example, consider 1001 = 7*11*13. Its non-trivial factors are 7, 11 , 13, 77, 91, 143. Note that 1 and 1001 are
     * trivial factors. maxDistance(1001) would return 136 because the largest distance between any two non-trivial factors
     * is 136 (143- 7 = 136). As another example, maxDistance (8) would return 2 because the non-trivial factors of 8 are 2 and
     * 4 and the largest distance between any two non-trivial factors is 2 (4 - 2 = 2). Also, maxDistance (7) would return -1 since
     * 7 has no non-trivial factors. Further, maxDistance (49) would return 0 since 49 has only one nontrivial factor 7. Hence
     * maxDistance (49) is 0 (7 - 7 = 0).**/
    public static int maxDistance(int n){
        int maxdist = 0;
        for(int i=2;i<n;i++){
             if(n%i==0){
                 for(int j=2;j<n;j++){
                     if(n%j==0){
                         int currDistance = Math.abs(i-j);
                         maxdist = Math.max(maxdist,currDistance);
                     }
                 }
             }
        }

        return maxdist;
    }
}
