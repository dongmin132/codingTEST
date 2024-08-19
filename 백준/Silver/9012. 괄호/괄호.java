import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (String str : arr) {
            System.out.println(isVps(str) ? "YES" : "NO");

        }
    }

    public static boolean isVps(String str) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '(') {
                stack.push(str.charAt(j));
            } else if (str.charAt(j) == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}

