import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] tmp = s.split("");
        Arrays.sort(tmp,Collections.reverseOrder());
        
        for(String st : tmp){
            answer += st;
        }
        return answer;
    }
}