class Solution {
    public String reverseByType(String s) {
        char[] ans = s.toCharArray();

        StringBuilder letters = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (char ch : ans) {
            if (Character.isLowerCase(ch)) {
                letters.append(ch);
            } else {
                special.append(ch);
            }
        }

        letters.reverse();
        special.reverse();

        int i = 0, j = 0;

        for (int k = 0; k < ans.length; k++) {
            if (Character.isLowerCase(ans[k])) {
                ans[k] = letters.charAt(i++);
            } else {
                ans[k] = special.charAt(j++);
            }
        }

        return new String(ans);
    }
}