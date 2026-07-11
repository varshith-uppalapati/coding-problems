class Solution {
    public int lengthOfLastWord(String s) {
        int a = s.length() - 1;
        
        while (a >= 0 && s.charAt(a) == ' ') {
            a--;
        }

        int b = 0;

        while (a >= 0 && s.charAt(a) != ' ') {
            b++;
            a--;
        }

        return b;
    }
}