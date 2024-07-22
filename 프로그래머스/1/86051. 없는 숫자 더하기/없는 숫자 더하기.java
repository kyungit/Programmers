import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int i = 0;
        Arrays.sort(numbers);

        for (int num : numbers) {
            while (i < num) {
                answer += i;
                i++;
            }
            i++;
        }
        
        while (i <= 9) { 
            answer += i;
            i++;
        }

        return answer;
    }
}
