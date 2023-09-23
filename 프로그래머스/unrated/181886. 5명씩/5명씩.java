class Solution {
    public String[] solution(String[] names) {
        String[] answer;
        if(names.length%5!=0){
           answer = new String[names.length/5+1];
        }
        else
            answer = new String[names.length/5];

       int i=0;
        for(int j=0;j<names.length;j=j+5){
            answer[i] = names[j];
            i++;
        }
        return answer;
    }
}