class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String s = myString.replaceAll("A","X").replaceAll("B","A").replaceAll("X","B");
        if(s.contains(pat)) answer = 1;
        return answer;
    }
}