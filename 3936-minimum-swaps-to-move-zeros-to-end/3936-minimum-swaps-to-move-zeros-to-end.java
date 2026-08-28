class Solution {
    public int minimumSwaps(int[] nums) {
        
        int operation=0;
        int countZero=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countZero++;
            }
        }
      
      System.out.println("countZero"+countZero);

        for(int i=nums.length-1;i>=0;i--){
            if(countZero>0){
                if(nums[i]==0){
                countZero--;
                }else{
                operation++;
                countZero--;
               }
            }
            
        }


        return operation;
    }
}