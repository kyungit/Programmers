import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int a=0; a<commands.length; a++){
                        
            List<Integer> tmp = new ArrayList<Integer>();
            
            int i,j,k;
            
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];
            System.out.println(i+" "+j+" "+k);

            
            
            int c = 0;
            int index = 0;
            
            for(index=i-1 ; index<j ; index++){
                // tmp[c] = array[i];
                tmp.add(array[index]);
                c++;
            }
            
            Collections.sort(tmp);
            // answer[d] = tmp[k];
            answer[a] = tmp.get(k-1);
            for(int tm : tmp){
                System.out.print(tm);
            }
            System.out.println();
            
            
        }        
        return answer;
    }
}