// 6 ms | 47.9 MB
class Solution {
    public int maxDistinct(String s) {
        int count=0;
        boolean[]arr=new boolean[26];

        for(int i= 0;i<s.length();i++){
            int index=s.charAt(i)-'a';

            if(arr[index]==false){
                arr[index]=true;
                count++;
            }
        }

        return count;
    }
}