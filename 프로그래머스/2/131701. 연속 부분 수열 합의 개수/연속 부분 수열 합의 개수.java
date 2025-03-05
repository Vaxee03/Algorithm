import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> uniqueSums = new HashSet<>();

        // 연속 부분 수열의 합 계산
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    sum += elements[(start + i) % n]; // 순환 배열을 직접 처리
                }
                uniqueSums.add(sum);
            }
        }

        return uniqueSums.size();
    }
}