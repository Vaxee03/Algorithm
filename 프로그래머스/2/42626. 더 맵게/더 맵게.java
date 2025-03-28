import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // 1. 우선순위 큐(최소 힙) 선언
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // 2. 모든 스코빌 지수 삽입
        for (int s : scoville) {
            pq.offer(s);
        }

        int count = 0; // 섞은 횟수

        // 3. 큐에 2개 이상 있고, 가장 작은 값이 K보다 작을 때만 반복
        while (pq.size() >= 2 && pq.peek() < K) {
            int first = pq.poll();        // 제일 작은 스코빌
            int second = pq.poll();       // 두 번째로 작은 스코빌

            int mixed = first + (second * 2); // 새로 섞은 음식
            pq.offer(mixed);              // 큐에 다시 삽입
            count++;                      // 섞은 횟수 증가
        }

        // 4. 모든 음식의 스코빌이 K 이상인지 확인
        if (pq.peek() < K) {
            return -1;
        }

        return count;
    }
}
