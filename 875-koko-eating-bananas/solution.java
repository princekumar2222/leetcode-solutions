// 12 ms | 48.1 MB
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int max=0;
        for(int p:piles)max=Math.max(max, p);
        int right=max;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            long hrs=hours(piles,mid);
            if(hrs<=h){
                ans=mid;
                right=mid-1;

            }
            else{
                left=mid+1;
            }
            
        }
        return ans;
    }
        


        
        
    
    long hours(int piles[],int k){
        long hrs=0;
        for(int p:piles){
            hrs+=p/k;
            if(p%k!=0)hrs++;
        }
        return hrs;
    }
}