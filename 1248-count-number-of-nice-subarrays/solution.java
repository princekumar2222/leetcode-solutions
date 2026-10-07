// 8 ms | 59.6 MB
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int count = 0;

        int i1 = 0;
        int i2 = 0;

        int odd1 = 0;
        int odd2 = 0;

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] % 2 != 0) {
                odd1++;
                odd2++;
            }

            // Window 1: at most k odd
            while (odd1 > k) {
                if (nums[i1] % 2 != 0) {
                    odd1--;
                }
                i1++;
            }

            // Window 2: at most k-1 odd
            while (odd2 >= k) {
                if (nums[i2] % 2 != 0) {
                    odd2--;
                }
                i2++;
            }

            count = count + (i2 - i1);
        }

        return count;
    }
}