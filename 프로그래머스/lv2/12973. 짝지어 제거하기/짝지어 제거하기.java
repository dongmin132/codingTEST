import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
//        char[] charArray = s.toCharArray();       효율만 잡아먹는다
        Stack<Character> stack = new Stack<>();
        char cha;

        for (int i = 0; i < s.length(); i++) {
            cha = s.charAt(i);
            if (stack.isEmpty())
                stack.push(cha);
            else {
                if (stack.peek().equals(cha))
                    stack.pop();
                else
                    stack.push(cha);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}