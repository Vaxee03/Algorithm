class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        for (int W = total; W >= 3; W--) { // W를 큰 값부터 탐색 (total → 3)
            if (total % W == 0) { // W가 total의 약수인지 확인
                int H = total / W; // H 계산

                if (W >= H && (W - 2) * (H - 2) == yellow) { // W >= H 조건 유지
                    return new int[]{W, H};
                }
            }
        }
        return new int[0];
    }
}
