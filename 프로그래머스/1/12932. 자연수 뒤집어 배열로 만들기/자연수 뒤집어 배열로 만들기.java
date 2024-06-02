class Solution {
    public int[] solution(long n) {
        String s = n+"";
        String[] tmp = s.split("");
        int index = tmp.length-1;
        int[] answer = new int[tmp.length];
        for(int i=0; i<tmp.length; i++){
            answer[index] = Integer.parseInt(tmp[i]);
            index--;
        }
        return answer;
    }
}