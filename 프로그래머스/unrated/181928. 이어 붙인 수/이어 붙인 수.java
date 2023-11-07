class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd="";
        String even="";
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2!=0){   //홀수인 경우
                odd+=Integer.toString(num_list[i]);
                System.out.println(odd);
            }
            else if(num_list[i]%2==0){   //짝수인 경우
                even+=Integer.toString(num_list[i]);
                System.out.println(even);
            }
            
            
            
        }
        answer= Integer.parseInt(odd) + Integer.parseInt(even);
        return answer;
    }
}