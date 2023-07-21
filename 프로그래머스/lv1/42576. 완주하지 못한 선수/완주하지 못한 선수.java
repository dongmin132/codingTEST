import java.util.HashMap;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
////import java.util.HashMap;
////
////class Solution {
////    public int[] solution(int N, int[] stages) {
////        HashMap<Integer, Double> stageFail = new HashMap<>();
////        int totalUser = 0;
////        int failUser=0;
////        int stage = 1;
////        for (int j = 0; j < N; j++) {
////            totalUser=0;
////            failUser=0;
////            for (int i = 0; i < stages.length; i++) {
////                if (stage <= stages[i]) {
////                    totalUser++;
////                }
////                if (stage == stages[i]) {
////                    failUser++;
////                }
////            }
////            stageFail.put(stage, (double)failUser / totalUser);
////            stage++;
////        }
////
////        int[] answer = new int[N];
////        for (int i = 0; i < N; i++) {
////            double max = -1;
////            int rKey = 0;
////            for (int key : stageFail.keySet()){
////                if(max < stageFail.get(key)){
////                    max = stageFail.get(key);
////                    rKey = key;
////                }
////            }
////            answer[i] = rKey;
////            stageFail.remove(rKey);
////            System.out.println(answer[i]);
////        }
////
////        return answer;
////    }
////}
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        for (int i = 0; i < participant.length; i++) {
//            for (int j = 0; j < completion.length; j++) {
//                if(participant[i].contains(completion[j]))
//                    continue;
//                else
//            }
//        }
//        return answer;
//    }
//}
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> members = new HashMap<>();
        for (String member : participant) {
            members.put(member, members.getOrDefault(member, 0) + 1);
        }

        for (String failMember : completion) {
            members.put(failMember, members.get(failMember)-1);
        }

        for (String failMember : members.keySet()) {
            if (members.get(failMember) == 1) {
                answer = failMember;
            }
        }
        return answer;
    }
}