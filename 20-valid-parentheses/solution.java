// 4 ms | 42.8 MB
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()&& pair(st.peek(),ch)){
                st.pop();

            }
            else{
                st.push(ch);

            }

        }
        return st.isEmpty();

    }
    public boolean pair(char ch1,char ch2){
        return (ch1=='('&& ch2==')')||
               (ch1=='{'&& ch2=='}')||
               (ch1=='['&& ch2==']');

    }
}