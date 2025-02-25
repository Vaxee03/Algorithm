class Solution {
    public int solution(int n) {
        int MOD = 1234567;
        int a = 0, b = 1;
        
        for (int i = 2; i <= n; i++) {
            int temp = (a + b) % MOD;
            a = b;
            b = temp;
        }
        
        return b;
    }
}
