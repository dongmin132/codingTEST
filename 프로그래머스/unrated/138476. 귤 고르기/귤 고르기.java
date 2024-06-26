import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        //각각의 귤의 size를 뽑아온다.
        List<Integer> sizeList = new ArrayList<>(map.keySet());

        //각각의 키의 대한 값을 내림차순으로 정렬한다.
        sizeList.sort((o1, o2) ->
                map.get(o2) - map.get(o1));

        int i = 0;
        while (k > 0) {
            k -= map.get(sizeList.get(answer));
            answer++;
        }
        return answer;
    }
}