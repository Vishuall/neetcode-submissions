class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        int l = 0;
        int r = 0;

        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                res = Math.max(r-l + 1, res);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return res;
    }
}
