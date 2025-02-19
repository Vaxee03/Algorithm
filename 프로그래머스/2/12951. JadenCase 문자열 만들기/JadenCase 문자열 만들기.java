class Solution {
    public String solution(String s) {
        String[] words = s.toLowerCase().split(" ", -1);
        
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
            }
        }
        
        return String.join(" ", words);
    }
}
