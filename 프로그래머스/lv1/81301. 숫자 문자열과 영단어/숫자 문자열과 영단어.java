
class Solution {
    public int solution(String n) {
        String[] arrNum = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            if (n.contains(arrNum[i])) {
                n=n.replace(arrNum[i],Integer.toString(i));     //바뀐 값을 넣어줘야됨
            }
        }
        return Integer.valueOf(n);
    }
}