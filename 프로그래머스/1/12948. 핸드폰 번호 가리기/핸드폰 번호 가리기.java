class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] tmp = phone_number.split("");
        for(int i=0; i<tmp.length-4; i++){
            tmp[i]="*";
        }
        for(String s : tmp){
            answer += s;
        }
        
        return answer;
    }
}