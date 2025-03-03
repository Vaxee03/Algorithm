import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> uniqueSums = new HashSet<>();

        // 원형 수열 처리를 위해 배열 2배 확장
        int[] extended = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            extended[i] = elements[i % n];
        }

        // 연속 부분 수열의 합 계산
        for (int length = 1; length <= n; length++) { // 부분 수열의 길이
            for (int start = 0; start < n; start++) { // 시작 위치
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    sum += extended[start + i];
                }
                uniqueSums.add(sum); // 중복 제거를 위해 Set 사용
            }
        }

        return uniqueSums.size(); // 중복 제거된 합의 개수 반환
    }
}
