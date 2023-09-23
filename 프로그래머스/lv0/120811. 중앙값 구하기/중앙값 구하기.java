import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);     
        // for(int i=0;i<array.length-1;i++){
        //     if(array[i]>array[i+1]){
        //         int k = array[i];
        //         array[i] = array[i+1];
        //         array[i+1] = k;
        //     }
        // }
        answer = array[array.length/2];
        return answer;
    }
}