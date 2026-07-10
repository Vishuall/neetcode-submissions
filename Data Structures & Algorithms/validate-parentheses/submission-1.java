class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            // pushing c to stack
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                // removing last brackets
                char open = stack.pop();
                if((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
