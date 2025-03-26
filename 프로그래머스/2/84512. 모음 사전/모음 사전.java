class Solution {
    public int solution(String word) {
        int[] weights = {781, 156, 31, 6, 1};
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            
            // 현재 글자의 인덱스 (A=0, E=1, I=2, O=3, U=4)
            int idx = "AEIOU".indexOf(word.charAt(i));
            answer += idx * weights[i] + 1;
        }

        return answer;
    }
}
