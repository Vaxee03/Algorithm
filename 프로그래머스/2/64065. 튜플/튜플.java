import java.util.*;

class Solution {
    public int[] solution(String s) {

        s = s.substring(2, s.length() - 2).replace("},{", "-");
        String[] sets = s.split("-");

        Arrays.sort(sets, Comparator.comparingInt(String::length));

        Set<Integer> tupleSet = new LinkedHashSet<>();

        for (String set : sets) {
            for (String num : set.split(",")) {
                tupleSet.add(Integer.parseInt(num));
            }
        }

        return tupleSet.stream().mapToInt(Integer::intValue).toArray();
    }
}
