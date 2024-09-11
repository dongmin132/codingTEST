import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String S = sc.next();

        for(int i = 97; i<= 122;i++) {
            char c = (char)i;
            if(S.indexOf(c) == -1) {
                sb.append(-1).append(" ");
            } else {
                sb.append(S.indexOf(c)).append(" ");
            }
        }


        System.out.println(sb);

    }
}