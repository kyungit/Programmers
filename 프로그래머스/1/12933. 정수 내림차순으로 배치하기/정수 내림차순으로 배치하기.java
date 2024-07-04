import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String tmp = String.valueOf(n);
        String[] s = tmp.split("");
        Arrays.sort(s, Collections.reverseOrder());
        for(String val : s){
            answer += val;
        }
        return Long.parseLong(answer);
    }
}