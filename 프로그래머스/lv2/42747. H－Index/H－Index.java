import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int citation : citations) {
            list.add(citation);
        }
        Collections.sort(list,Collections.reverseOrder());

        int h =0;
        for (int i = 0; i < citations.length; i++) {
            if(list.get(i)>=i+1)
                h=i+1;
        }
        return h;
    }
}