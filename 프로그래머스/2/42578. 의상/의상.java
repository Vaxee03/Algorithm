import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        // 의상 종류별 개수를 저장할 HashMap
        Map<String, Integer> categoryCount = new HashMap<>();

        // 의상의 종류별 개수 세기
        for (String[] item : clothes) {
            
            // 의상의 종류
            String category = item[1];
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
        }

        // 조합의 수 계산 (각 종류별 (개수 + 1)
        int answer = 1;
        for (int count : categoryCount.values()) {
            answer *= (count + 1);
        }
        
        // 아무것도 입지 않는 경우 제외
        return answer - 1;  
    }
}
