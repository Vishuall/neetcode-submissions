class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Store opening brackets
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {

                // A closing bracket cannot exist without an opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.peek();

                // Check whether the brackets form a matching pair
                if ((c == '}' && opening == '{') ||
                    (c == ')' && opening == '(') ||
                    (c == ']' && opening == '[')) {

                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        // Empty stack means every opening bracket was closed
        return stack.isEmpty();
    }
}