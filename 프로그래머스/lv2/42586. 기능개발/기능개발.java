import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] works = new int[progresses.length];
        int count = 1;

        for (int i = 0; i < works.length; i++) {
            works[i] = (100 - progresses[i]) / speeds[i];
            if ((100-progresses[i])%speeds[i] != 0){
                works[i]  += 1;
            }
        }

        int x = works[0];
        for (int i = 1; i < progresses.length; i++) {
            if (x >= works[i]) {
                count++;
            } else {
                answer.add(count);
                count = 1;
                x = works[i];
            }
        }
        answer.add(count);
        return answer;
    }
}