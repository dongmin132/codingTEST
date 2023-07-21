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
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            strings[i]=(strings[i].charAt(n) + strings[i]);
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1, strings[i].length());
        }
        return answer;
    }
}