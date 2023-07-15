class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder binaryString = new StringBuilder();
        String zero = "0";

        for (int i = 0; i < n; i++) {
            binaryString.append(Integer.toBinaryString(arr1[i] | arr2[i]));
            if (binaryString.length() != n) binaryString.insert(0,zero.repeat(n-binaryString.length()));        //필요한 만큼 0을 채우고
            answer[i]= binaryString.toString();
            answer[i]=answer[i].replaceAll("1", "#");
            answer[i]=answer[i].replaceAll("0", " ");
            binaryString.setLength(0);
        }

        return answer;
    }
}