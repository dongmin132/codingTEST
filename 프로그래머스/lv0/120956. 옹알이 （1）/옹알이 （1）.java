import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babble = {"aya", "ye", "woo", "ma"};
        int startIdx;
        int endIdx;

        for (int i = 0; i < babbling.length; i++) {
            StringBuilder str = new StringBuilder(babbling[i]);
            for(String s : babble) {
                if (babbling[i].contains(s)) {
                    startIdx = str.indexOf(s);
                    endIdx = startIdx + s.length();
                    if (startIdx >= 0) {
                        str.delete(startIdx, endIdx);
                    }

                }
            }
            if (str.length()==0)
                answer++;
        }
        return answer;
    }
}