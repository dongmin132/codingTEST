import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        for (String key : map.keySet()) {
            answer *= map.get(key)+1;       //각 원소의 경우의 입지 않는걸 포함하는 +1
        }
        return answer-1;        //경우의 수 중 반드시 한가지는 입어야 하므로 1을 빼준다.
    }
}
