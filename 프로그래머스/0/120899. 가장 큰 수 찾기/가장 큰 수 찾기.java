import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        List<Integer> list = new ArrayList<Integer>();
        Integer[] arrWrapper = new Integer[array.length];
        for(int i=0; i<array.length; i++){
            list.add(i,array[i]);
            arrWrapper[i] = array[i];
        }
        Arrays.sort(arrWrapper, Collections.reverseOrder());
        
        int max = arrWrapper[0];
        int max_index = list.indexOf(max);
        
        answer[0] = max;
        answer[1] = max_index;
        return answer;
    }
}