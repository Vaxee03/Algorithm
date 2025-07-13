class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int gcd = 0;
    
        while (denom != 0) {
            int temp = numer % denom;
            numer = denom;
            denom = temp;
        }
        
        gcd = numer;
            
        answer[0] = ((numer1 * denom2) + (numer2 * denom1)) / gcd;
        answer[1] = denom1 * denom2 / gcd;
        
        return answer;
    }
}