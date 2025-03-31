import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // 스택에는 "가격이 떨어지지 않은 시점의 인덱스"를 저장
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int prev = stack.pop();
                answer[prev] = i - prev; // 가격이 떨어진 시간
            }
            stack.push(i); // 현재 시점을 스택에 저장
        }

        // 남아있는 인덱스는 끝까지 가격이 떨어지지 않은 경우
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - 1 - idx;
        }

        return answer;
    }
}
