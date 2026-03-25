class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        

        int arr[][]=new int[( grid.length- k + 1)][(grid[0].length - k + 1)];
        
        int store[]=new int[k*k];

        for(int i=0;i<=grid.length-k;i++){
           
            for(int j=0;j<=grid[0].length-k;j++){
                 int n=0;
            for(int z=i;z<i+k;z++){
                
               for(int l=j;l<j+k;l++){
                  store[n]=grid[z][l];
                  n++;
             }
             }
            int min=Integer.MAX_VALUE;
             Arrays.sort(store);
             for(int h=1;h<store.length;h++){
                if(store[h-1]!=store[h]){
                   int temp= Math.abs(store[h-1]-store[h]);
                   if(min>temp){
                    min=temp;
                   }
                }
             }
             
             if(min==Integer.MAX_VALUE){
               arr[i][j]=0;
             }else{
                arr[i][j]=min;
             }
             
             
          }
        }
        return arr;
    }
}