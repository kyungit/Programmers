class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int lastNum = num_list.length-1;
        if(num_list[lastNum-1] <num_list[lastNum]){
            for(int i=0;i<lastNum+1;i++){
                answer[i]=num_list[i];
            }
            answer[lastNum+1] = num_list[lastNum] - num_list[lastNum-1];
        }else{
            for(int i=0;i<lastNum+1;i++){
                answer[i]=num_list[i];
            }
            answer[lastNum+1] = num_list[lastNum]*2;
        }
        return answer;
    }
}