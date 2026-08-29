class Solution {
    public int distributeCandies(int n, int limit) {
      
      int count=0;
        for(int i=0;i<=limit;i++){
           for(int j=0;j<=limit;j++){
               for(int z=limit;z>=0;z--){
                  int total=i+j+z;
                  if(n==total ){
                    count++;
                  }
               } 
            }
        }

        return count;
    }
}