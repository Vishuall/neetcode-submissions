class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {

            // If current character is not in the window
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } 
            // Duplicate found, shrink the window
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}