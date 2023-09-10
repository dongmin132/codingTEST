import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (wordList.contains(words[i])) {  //이전에 나왔던 단어인 경우
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                return answer;
            }
            wordList.add(words[i]);
        }
        for (int i = 1; i < wordList.size(); i++) {
            if (words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)) {
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                return answer;
            }
        }
        return answer;
    }
}