import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        for(int i = 0;i<s;i++) {
            int n = sc.nextInt();
            String p = sc.next();

            for(int j = 0;j<p.length();j++) {
                sb.append(String.valueOf(p.charAt(j)).repeat(Math.max(0, n)));
            }

            sb.append("\n");
        }

        System.out.println(sb);

    }
}