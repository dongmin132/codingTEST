import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import java.util.HashMap;
//
//class Solution {
//    public int[] solution(int N, int[] stages) {
//        HashMap<Integer, Double> stageFail = new HashMap<>();
//        int totalUser = 0;
//        int failUser=0;
//        int stage = 1;
//        for (int j = 0; j < N; j++) {
//            totalUser=0;
//            failUser=0;
//            for (int i = 0; i < stages.length; i++) {
//                if (stage <= stages[i]) {
//                    totalUser++;
//                }
//                if (stage == stages[i]) {
//                    failUser++;
//                }
//            }
//            stageFail.put(stage, (double)failUser / totalUser);
//            stage++;
//        }
//
//        int[] answer = new int[N];
//        for (int i = 0; i < N; i++) {
//            double max = -1;
//            int rKey = 0;
//            for (int key : stageFail.keySet()){
//                if(max < stageFail.get(key)){
//                    max = stageFail.get(key);
//                    rKey = key;
//                }
//            }
//            answer[i] = rKey;
//            stageFail.remove(rKey);
//            System.out.println(answer[i]);
//        }
//
//        return answer;
//    }
//}
class Solution {
    public List<Integer> solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        //int[] answer = {};
        int[] answerCount = {0,0,0};
        for (int i = 0; i < answers.length; i++) {
            if(answers[i]==one[i%5]) answerCount[0]++;
            if(answers[i]==two[i%8]) answerCount[1]++;
            if(answers[i]==three[i%10]) answerCount[2]++;
        }
        int max = Arrays.stream(answerCount).max().getAsInt();      //최대값 찾기
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == answerCount[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }
}