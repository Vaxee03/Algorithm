class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = 1;
        int mod = 1234567;
        
        for (int i = 2; i <= n; i++) {
            answer = (a + b) % mod;
            a = b;
            b = answer;
        }
        
        return answer;
    }
}
