class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sol = new StringBuilder();
        int sum =0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(sum>0){
                    sol.append(ch);
                }
                sum++;
            }
            else{
                sum--;
                if(sum>0){
                    sol.append(ch);
                }
            }
        }
        return sol.toString();
        
    }
}