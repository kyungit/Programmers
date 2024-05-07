class Solution {
    public String solution(String rsp) {
        String answer = "";
        //가위 2
        //바위 0
        //보 5
        
        String[] rsp2 = rsp.split("");
        String[] rsp_answer = new String[rsp2.length];
        for(int i=0;i<rsp2.length;i++){
            if(rsp2[i].equals("0")){
                rsp_answer[i] = "5";
            } else if(rsp2[i].equals("2")) {
                rsp_answer[i] = "0";
            } else if(rsp2[i].equals("5")) {
                rsp_answer[i] = "2";
            } 
        }
        
        for(int i=0;i<rsp_answer.length;i++){
            answer += rsp_answer[i];
        }
        
        
        return answer;
    }
}