class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            //맨 첫 글자는 s.substring(0,0)이 되기 때문에 0번째 인덱스부터 0번째라는 뜻이므로 빈 문자열이 나온다
            int a = s.substring(0, i).lastIndexOf(s.charAt(i));
            answer[i] = a == -1 ? -1 : i-a;
        }

        return answer;
    }
}