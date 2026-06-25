class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        char digit = (char) (x + '0');

        if (s.charAt(0) == digit) {
            return false;
        }

        return s.indexOf(digit) != -1;
    }
}