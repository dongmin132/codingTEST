import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int n) {
        List numList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                numList.add(i);
        }
        return numList;
    }
}