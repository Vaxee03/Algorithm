class Solution {
    public String solution(String my_string, String letter) {
        
        String answer = my_string.replace(String.valueOf(letter), "");
    
        return answer;
    }
}