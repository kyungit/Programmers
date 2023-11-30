import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       
        int j=0;
        
        
        Map<Integer,Integer> data = new HashMap<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                data.put(j,arr[i]);
                j++;
                if(i == arr.length-2){
                    data.put(j,arr[i+1]);
                }
            }
            else {
                if(i == arr.length-2){
                    data.put(j,arr[i]);
                }
            }
        }
        int[] answer = new int[data.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = data.get(i);
        }

        return answer;
    }
}