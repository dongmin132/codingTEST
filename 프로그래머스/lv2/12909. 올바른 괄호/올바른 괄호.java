import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {      
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty())     //줄일 수 있는 방법을 찾아보자
                    return false;
                else
                    stack.pop();
            }
        }

        return stack.isEmpty();
    }
}