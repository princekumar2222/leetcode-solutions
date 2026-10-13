// 2 ms | 47.6 MB
class Solution {
    public boolean canJump(int[] nums) {
        int maxreach=0;
        int last=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(i>maxreach){
                return false;
            }
        
        maxreach=Math.max(maxreach,i+nums[i]);
        if(maxreach>=last){
            return true;
        }
        }
        return true;
        
    }
}