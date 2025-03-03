class Solution {
    public int solution(int n, int a, int b) {
        int round = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }

        return round;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(8, 4, 7)); // 3
    }
}
