class Solution {
    public int countGoodRotations(int[] nums) {
      
       long total=0;
       long leftsum=0;
       int count=0;

       for(int i=0;i<nums.length;i++){
           if(i<nums.length/2){
             leftsum=leftsum+nums[i];
           }

           total=total+nums[i];
       } 
      
      long rigthsum=0;
      rigthsum=total-leftsum;
      if(leftsum!=rigthsum){
            count++;
          }

       int j=(nums.length/2);
        
       for(int i=0;i<(nums.length/2)-1;i++){
          leftsum=leftsum-nums[i];
          leftsum=leftsum+nums[j];
          rigthsum=total-leftsum;

       

          if(leftsum!=rigthsum){
            count++;
          }

         j++;
       }

      
       return count;
    }
}