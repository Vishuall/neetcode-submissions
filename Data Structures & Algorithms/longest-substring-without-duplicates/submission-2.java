class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();

        while (right < s.length()) {

            // If current character is not in the window
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max = Math.max(max, right - left + 1);
                right++;
            } 
            // Duplicate found, shrink the window
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
