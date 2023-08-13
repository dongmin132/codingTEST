import com.sun.jdi.IntegerValue;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for (String s : X.split("")) {
            arrX[Integer.parseInt(s)]++;
        }
        for (String s : Y.split("")) {
            arrY[Integer.parseInt(s)]++;
        }

        for (int i = 9; i >=0; i--) {
            if (arrX[i] > 0 && arrY[i] > 0) {
                int length = Math.min(arrX[i], arrY[i]);
                for (int j = 0; j < length; j++) {
                    sb.append(i);
                }
            }
        }
        if("".equals(sb.toString()))
            return "-1";
        answer = sb.charAt(0)=='0'?"0":sb.toString();
        return answer;
    }
}