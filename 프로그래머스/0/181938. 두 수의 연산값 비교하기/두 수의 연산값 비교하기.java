class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String first = a+""+b;
        
        int second = 2*a*b;
        
        if(Integer.parseInt(first)>second)
            return Integer.parseInt(first);
        else
            return second;
        
    }
}