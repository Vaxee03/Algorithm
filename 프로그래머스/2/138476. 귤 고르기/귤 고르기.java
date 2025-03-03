import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int size : tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }

        List<Integer> sortedCounts = new ArrayList<>(countMap.values());
        sortedCounts.sort(Collections.reverseOrder());

        int total = 0;
        int kindCount = 0;

        for (int cnt : sortedCounts) {
            total += cnt;
            kindCount++;
            if (total >= k) break;
        }

        return kindCount;
    }
}
