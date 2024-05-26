import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int s : scoville)
            pq.add(s);
        
        int min = 0;
        while(!pq.isEmpty() && pq.peek() < K){
            if(pq.size() == 1){
                return -1; // 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우
            }
            min = pq.poll() + pq.poll()*2 ;
            pq.offer(min);
            answer++;
        }
        
        return answer;
    }
}
