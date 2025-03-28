class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        // ▲/▼ 조작 횟수 합산
        for (int i = 0; i < length; i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }

        // ◀/▶ 이동 최소값 계산
        int minMove = length - 1;

        for (int i = 0; i < length; i++) {
            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }

            int move1 = i + i + (length - next); // 오른쪽 → 왼쪽
            int move2 = i + 2 * (length - next); // 왼쪽 → 오른쪽

            minMove = Math.min(minMove, Math.min(move1, move2));
        }

        return answer + minMove;
    }
}