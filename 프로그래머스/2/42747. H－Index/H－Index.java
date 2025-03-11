import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        
        // 인용 횟수를 내림차순 정렬
        Arrays.sort(citations);
        
        int n = citations.length;
        
        // 2. H-Index 찾기
        for (int i = 0; i < n; i++) {
            
            // 현재 논문 개수 (index를 고려하여 h 계산)
            int h = n - i; 
            
            if (citations[i] >= h) {
                
                return h;
            }
        }
        return 0;
    }
}