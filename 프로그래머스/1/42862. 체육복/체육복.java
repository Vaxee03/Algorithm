import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        // 중복 제거를 위해 리스트 대신 Set 사용
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 먼저 lost, reserve 중복 제거
        for (int l : lost) {
            lostSet.add(l);
        }
        
        for (int r : reserve) {
            // 만약 reserve에도 있고 lost에도 있으면 자기 거 입고 끝
            if (lostSet.contains(r)) {
                lostSet.remove(r); // 빌릴 필요도 없고 빌려줄 수도 없음
            } else {
                reserveSet.add(r);
            }
        }

        // reserve를 정렬해서 앞 번호부터 빌려주기
        List<Integer> sortedReserve = new ArrayList<>(reserveSet);
        Collections.sort(sortedReserve);

        for (int r : sortedReserve) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }

        // 체육복을 갖고 있는 학생 수 = 전체 학생 수 - 아직도 잃어버린 학생 수
        return n - lostSet.size();
    }
}
