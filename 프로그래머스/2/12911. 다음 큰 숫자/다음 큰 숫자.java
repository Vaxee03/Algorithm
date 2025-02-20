class Solution {
    public int solution(int n) {
        
        // n의 1의 개수를 저장
        int countOne = Integer.bitCount(n);
        
        // n보다 큰 수 중에서 같은 1의 개수를 가지는 가장 작은 수 찾기
        int nextNumber = n + 1;
        while (Integer.bitCount(nextNumber) != countOne) {
            nextNumber++;
        }
        
        return nextNumber;
    }
}