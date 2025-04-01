class Solution {
    public int solution(int n) {
        
        // 피자 조각 수는 판 수 * 7
        // 사람 수가 1~7 까지는 한 판, 8~14 까지는 두 판 이런 식
        
        if(n%7!=0){
            return n/7 +1;
        }
        else {
            return n/7;
        }
    }
}