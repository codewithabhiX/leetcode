class Solution {
    public int firstStableIndex(int[] nums, int k) {
          int max=0;
        int totalMin=Integer.MAX_VALUE;
       
        for(int i=0;i<nums.length;i++){
          
        int min=Integer.MAX_VALUE;
           if(nums[i]>max){
            max=nums[i];
           }
          for(int j=i;j<nums.length;j++){
              if(nums[j]<min){
                min=nums[j];
              }
          }

          int total=max-min;
         
          if(total<=k){
            if(totalMin>i)
            totalMin=i;
          }
        }
    
         if(totalMin==Integer.MAX_VALUE){
            return -1;
         }
        return totalMin;
    }
}