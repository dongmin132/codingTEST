import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);

        int h =0;
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            h=n-i;
            if(citations[i]>=h)
                return h;
        }
        return h;
    }
}