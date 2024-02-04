import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int[] numbers, int num1, int num2) {
        List<Integer> numList = new ArrayList<>();
        for(int i = num1;i<num2+1;i++)
        {
            numList.add(numbers[i]);
        }
        return numList;
    }
}