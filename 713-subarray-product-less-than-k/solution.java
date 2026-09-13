// 392 ms | 49.2 MB
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product = product * nums[j];
                if (product < k) {
                    count++;
                } else {
                    break;
                }
            }        }

        return count;
    }
}