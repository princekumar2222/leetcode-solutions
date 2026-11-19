// 161 ms | 46.4 MB
class Solution {
    public boolean isValid(String s) {
        while(s.contains("()")||s.contains("{}")||s.contains("[]")){
            s=s.replace("()","");
            s=s.replace("{}","");
            s=s.replace("[]","");

        }
        return s.isEmpty();
        
    }
}