import java.util.*;
    
class Solution {
    public String solution(String s) {
        String answer = "";
        String tmp[] = s.split(" ");
        int tmpInt[] = new int[tmp.length];
        for(int i=0; i<tmp.length; i++){
            tmpInt[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(tmpInt);

        answer = tmpInt[0] + " " + tmpInt[tmpInt.length-1];
        return answer;
    }
}