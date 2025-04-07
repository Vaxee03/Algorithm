class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder all = new StringBuilder(); // 전체 숫자들을 저장할 문자열
        int num = 0; // 0부터 시작

        // 필요한 만큼 전체 숫자열 만들기
        while (all.length() < t * m) {
            all.append(Integer.toString(num++, n).toUpperCase());
        }

        StringBuilder answer = new StringBuilder();

        // 튜브가 말해야 하는 자리만 뽑기
        for (int i = 0; i < t; i++) {
            answer.append(all.charAt(i * m + (p - 1)));
        }

        return answer.toString();
    }
}
