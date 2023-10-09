class Solution {
    public int[] solution(int n) {
        int[] answer;
        if(n%2==0){
            answer = new int[n/2];
        }
        else
            answer = new int[n/2+1];
        
        int i=0;
        for(int num=1;num<=n;num++){
            if(num%2!=0){
                answer[i]=num;
                i++;
            }
        }
        
        
        
        return answer;
    }
}