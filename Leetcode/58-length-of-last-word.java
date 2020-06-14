/**
 * 
 * Leetcode #58 - https://leetcode.com/problems/length-of-last-word/
 */

class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;

        int count = 0;
        int index = s.length() - 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                index = i;
                break;
            }
        }

        for (int i = index; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            count++;
        }

        return count;
    }
}