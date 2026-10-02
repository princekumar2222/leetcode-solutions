// 1 ms | 42.5 MB
class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int squaresum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            squaresum=squaresum+digit*digit;
            n=n/10;
        }
        if ((squaresum-sum)>=50){
        return true;

        }
        else{
            return false;
        }
       
        
    }
}