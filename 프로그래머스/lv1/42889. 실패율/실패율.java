import java.util.HashMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> stageFail = new HashMap<>();
        int totalUser = 0;
        int failUser=0;
        int stage = 1;
        for (int j = 0; j < N; j++) {
            totalUser=0;
            failUser=0;
            for (int i = 0; i < stages.length; i++) {
                if (stage <= stages[i]) {
                    totalUser++;
                }
                if (stage == stages[i]) {
                    failUser++;
                }
            }
            if(totalUser==0&&failUser==0) totalUser =1;
            stageFail.put(stage, (double)failUser / totalUser);
            stage++;
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            double max = -1;
            int rKey = 0;
            for (int key : stageFail.keySet()){
                if(max < stageFail.get(key)){
                    max = stageFail.get(key);
                    rKey = key;
                }
            }
        
            answer[i] = rKey;
            stageFail.remove(rKey);
            System.out.println(answer[i]);
        }

        return answer;
    }
}