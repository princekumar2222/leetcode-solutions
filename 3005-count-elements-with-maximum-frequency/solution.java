// 1 ms | 43.9 MB
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxfr = 0;        int total = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            //  skip if already processed
            boolean seen = false;
            for(int k = 0; k < i; k++){
                if(nums[k] == nums[i]){
                    seen = true;
                    break;                }
            }
            if(seen) continue;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;                }
            }
            if(count > maxfr){
                maxfr = count;
                total = count;            }
            else if(count == maxfr){
                total += count;
            }        }
        return total;
    }
}