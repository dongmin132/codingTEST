import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < t * m; i++) {
            list.append(Integer.toString(i, n).toUpperCase());
        }

        for (int i = p-1; i < t*m; i+=m) {
            if (i % m == p - 1) {
                answer += list.charAt(i);

            }
        }
        return answer;
    }
}