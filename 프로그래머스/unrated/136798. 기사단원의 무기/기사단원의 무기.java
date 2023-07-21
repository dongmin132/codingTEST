class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        int[] arr = new int[number];
        int count =1;
        for (int i = 2; i <= number; i++) {
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > limit) {
                    count = power;
                    break;
                }
            }
           
            answer+=count;
            count =1;
        }


        return answer;
    }
}