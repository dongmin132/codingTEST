class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        for (int i = 1; i <= yellow; i++) {
            int row = i;
            int col = yellow / row;
            if (col > row) {
                continue;
            }
            int brownRow = row + 2;
            int brownCol = col + 2;
            if (brownRow * brownCol == area) {
                answer[0] = brownRow;
                answer[1] = brownCol;
                return answer;
            }
        }
        return answer;
    }
}