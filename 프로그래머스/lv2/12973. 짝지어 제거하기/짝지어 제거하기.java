import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (Character cha : charArray) {
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