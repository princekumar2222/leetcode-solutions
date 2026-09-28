// 4 ms | 47.2 MB
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
           while(temp>0){
            int digit1=temp%10;
         
            if(digit1==digit){
                count++;
            }
            temp=temp/10;
        }
        }
        return count;
        
    }
}