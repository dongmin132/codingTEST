class Solution {
    public String solution(String s, int n) {
        StringBuilder caesar = new StringBuilder(s);
        char ch;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                ch = (char) (caesar.charAt(i)+n);
                ch = (char) (ch > 90 ? ch - 26 : ch);
                caesar.setCharAt(i,ch);
            }
            else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                ch = (char) (caesar.charAt(i)+n);
                ch = (char) (ch > 122 ? ch - 26 : ch);
                caesar.setCharAt(i,ch);
            }
            else continue;
        }
        return caesar.toString();
    }
}