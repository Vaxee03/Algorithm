class Solution {
    public int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int mod = 1234567;
        int a = 1, b = 2;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = (a + b) % mod;
            a = b;
            b = result;
        }

        return result;
    }
}
