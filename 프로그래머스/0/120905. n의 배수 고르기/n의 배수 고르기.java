class Solution {
    public int[] solution(int n, int[] numlist) {
       int[] answer;
    
        int k=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){    //n의 배수인 경우 answer 에 넣기
                //answer[k] = numlist[i];
                k++;
            }
        }
        
        answer = new int[k];
        k=0;
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){    //n의 배수인 경우 answer 에 넣기
                answer[k] = numlist[i];
                k++;
            }
        }
         
        
        return answer;
    }
}