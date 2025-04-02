import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long left = 1; // 최소 시간
        long right = (long) Arrays.stream(times).max().getAsInt() * n; // 최대 시간
        long answer = right;

        while (left <= right) {
            long mid = (left + right) / 2;

            // mid 시간 동안 몇 명 심사할 수 있는지 계산
            long count = 0;
            for (int t : times) {
                count += mid / t;
            }

            if (count >= n) {
                // 충분히 심사 가능 → 시간 줄여보기
                answer = mid;
                right = mid - 1;
            } else {
                // 부족 → 시간 늘리기
                left = mid + 1;
            }
        }

        return answer;
    }
}
