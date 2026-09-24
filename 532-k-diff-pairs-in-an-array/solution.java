// 55 ms | 46.6 MB
class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums); 
         for(int i=0;i<nums.length;i++){ 
            if(i>0 && nums[i]==nums[i-1]){
            continue;
            }
            for(int j=i+1;j<nums.length;j++){
                int max=Math.abs(nums[i]-nums[j]);
                if(max==k){
                    count++;
                    break;
                }
            }
         }
         return count;
    }
}