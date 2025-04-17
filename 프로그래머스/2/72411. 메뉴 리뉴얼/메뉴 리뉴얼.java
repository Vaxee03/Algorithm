import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> result = new ArrayList<>();

        for (int len : course) {
            Map<String, Integer> map = new HashMap<>();
            int maxCount = 0;

            // 1. 각 주문마다 조합 생성
            for (String order : orders) {
                char[] chars = order.toCharArray();
                Arrays.sort(chars); // 정렬 후 조합 생성을 위해

                combination(map, chars, new StringBuilder(), 0, len);
            }

            // 2. 최대 등장 횟수 구하기
            for (int count : map.values()) {
                maxCount = Math.max(maxCount, count);
            }

            // 3. 2번 이상 등장한, 최대 빈도수 조합만 결과에 추가
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxCount && maxCount >= 2) {
                    result.add(entry.getKey());
                }
            }
        }

        // 4. 사전 순 정렬
        Collections.sort(result);

        // 5. 배열로 변환해서 리턴
        return result.toArray(new String[0]);
    }

    // 조합을 구하는 재귀 함수
    private void combination(Map<String, Integer> map, char[] arr, StringBuilder sb, int index, int len) {
        if (sb.length() == len) {
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            sb.append(arr[i]);
            combination(map, arr, sb, i + 1, len); // 다음 인덱스로 재귀
            sb.deleteCharAt(sb.length() - 1); // 백트래킹
        }
    }
}
