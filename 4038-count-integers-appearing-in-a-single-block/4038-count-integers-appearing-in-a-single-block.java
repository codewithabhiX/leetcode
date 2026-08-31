class Solution {
    public int countSpecialIntegers(int[] nums) {
       
      int arr[]=new int[101];
      arr[nums[0]]=1;
       for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                arr[nums[i]]=arr[nums[i]]+1;
            }
       }
int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==1){
            count++;
        }
       }

return count;
    }
}