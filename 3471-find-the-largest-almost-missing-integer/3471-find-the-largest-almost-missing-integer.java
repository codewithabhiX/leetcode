class Solution {
    public int largestInteger(int[] nums, int k) {

        int first=nums[0];
        int last=nums[nums.length-1];
        int firstmax=nums[0];
        int lastmax=nums[nums.length-1];


        if(k==1){
            int value=-1;
            int max=-1;
            Arrays.sort(nums);
            for(int i=nums.length-2;i>=0;i--){

                  if(nums[i+1]!=nums[i]){
                   
                    if(value==-1){
                        
                      if(max<nums[i+1]){
                            max= nums[i+1]; 
                           
                        }
                    
                    }else if(value==nums[i+1]){
                      if(i==0){
                        if(max<nums[i]){
                         max= nums[i]; 
                        }
                        }else{
                            continue;
                        }
                    }else{
                        if(max<nums[i+1]){
                            max= nums[i+1]; 
                        }
                    }
                    
                  }else{
                     value=nums[i+1];
                  }
            }
            return max;
        }

if(k==nums.length){
    Arrays.sort(nums);
return nums[nums.length-1];
}
        
        for(int i=0;i<nums.length;i++){
         
            if(i!=0){
                if(first==nums[i]){
                    firstmax=-1;
                }
            }

             if(i!=nums.length-1){
                if(last==nums[i]){
                    lastmax=-1;
                }
            }
        }


        if(firstmax>=lastmax){
            return firstmax;
        }else{
            return  lastmax;
        }
    
       
    }

}