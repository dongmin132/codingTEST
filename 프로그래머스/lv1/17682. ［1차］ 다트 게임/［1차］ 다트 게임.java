import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] point = new int[3];
        int index=-1;
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i)>=48&&dartResult.charAt(i)<=57) {
                index++;
                point[index] = dartResult.charAt(i) - '0';
                if (dartResult.charAt(i + 1) == '0') {
                    point[index]*=10;
                    i++;
                }
            }
            switch (dartResult.charAt(i)) {
                case 'D':
                    point[index]*=point[index];
                    break;
                case 'T':
                    point[index]=(int)Math.pow(point[index], 3);
                    break;
                case '*':
                    if (index == 0) {
                        point[index] *= 2;
                    } else {
                        point[index]*=2;
                        point[index-1]*=2;
                    }
                  

                    break;
                case'#':
                        point[index]*=-1;
                    break;
                default:
                    break;
            }
        }
        for(int num : point)
            answer+=num;
        return answer;
    }
}