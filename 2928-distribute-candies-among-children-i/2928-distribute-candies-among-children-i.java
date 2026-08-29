class Solution {
    public int distributeCandies(int n, int limit) {
      
      int count=0;
        for(int i=0;i<=n;i++){
           for(int j=0;j<=n;j++){
               for(int z=n;z>=0;z--){
                  int total=i+j+z;
                  if(n==total && i<=limit && j<=limit && z<=limit){
                    count++;
                  }
               } 
            }
        }

        return count;
    }
}