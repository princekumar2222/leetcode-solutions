// 2 ms | 65.4 MB
class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int zeros=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zeros++;
            while(zeros>1){
                if(nums[left]==0){
                    zeros--;
                }
                    left++;
                
            }
        max=Math.max(max,i-left );

        }
        return max;    
    }
}