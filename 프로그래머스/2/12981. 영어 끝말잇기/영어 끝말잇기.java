import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String currWord = words[i];

            if (usedWords.contains(currWord) || prevWord.charAt(prevWord.length() - 1) != currWord.charAt(0)) {
                int person = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[]{person, turn};
            }

            usedWords.add(currWord);
        }

        return new int[]{0, 0};
    }
}
