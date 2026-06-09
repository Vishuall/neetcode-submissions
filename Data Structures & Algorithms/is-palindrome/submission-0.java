class Solution {
    public boolean isPalindrome(String s) {
        // remove space, colun and symbols from the array
        String t = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.length() == 0 || s.length() == 1){
            return true;
        }
        // take left and right two integers
        int right = t.length() - 1;
        for(int left = 0; left < (t.length()/2); left++){
            if(t.charAt(left) != t.charAt(right)){
                return false;
            }
            right-- ;
        }
        return true;
    }
}
