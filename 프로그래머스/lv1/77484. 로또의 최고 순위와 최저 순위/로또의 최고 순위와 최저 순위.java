import java.util.HashMap;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int zeroCount = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : win_nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count =0;
        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i]==0)
                zeroCount++;
            if (map.getOrDefault(lottos[i], 0) == 1) {  //값이 null이 들어가는지 테스트해보기
                count++;
            }
        }

        answer[0] = (7-(count+zeroCount))>5?6:7-(count+zeroCount);
        answer[1]= 7-count>5?6:7-count;
        return answer;
    }
}