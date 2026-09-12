// 6 ms | 47.5 MB
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]arr =new int[256];   
        Arrays.fill(arr,-1);

        int j=0;
        int maxLength=0;

        for(int i=0; i<s.length();i++) {
            char c=s.charAt(i);

            if(arr[c]>=j){
                j=arr[c]+1;  
            }

            arr[c]=i;  
            maxLength=Math.max(maxLength,i-j+1);
        }

        return maxLength;
    }
}