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
    public String solution(String s) {
        String answer = "";
            return s.length()%2==0?s.substring(s.length() / 2-1, s.length()/2+1):s.substring(s.length()/2,s.length()/2+1);  //범위 계산만 잘했으면 조건 연산자 없이도 풀 수 있었다


    }
}