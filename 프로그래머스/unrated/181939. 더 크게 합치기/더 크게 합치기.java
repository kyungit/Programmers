class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String A = Integer.toString(a);
        String B = Integer.toString(b);
        
        if(Integer.parseInt(A+B) > Integer.parseInt(B+A)) answer = Integer.parseInt(A+B);
        else if(Integer.parseInt(A+B) < Integer.parseInt(B+A)) answer = Integer.parseInt(B+A);
        else answer = Integer.parseInt(A+B);
        return answer;
    }
}