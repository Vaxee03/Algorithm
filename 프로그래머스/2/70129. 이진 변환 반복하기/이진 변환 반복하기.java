class Solution {
    public int[] solution(String s) {
        int changeCount = 0, zeroCount = 0;
        
        while (!s.equals("1")) {
            zeroCount += s.length() - s.replace("0", "").length();
            int num = s.replace("0", "").length();
            
            String text = "";
            while (num > 0) {
                text = (num % 2) + text;
                num /= 2;
            }
            s = text;
            changeCount++;
        }
        
        return new int[]{changeCount, zeroCount};
    }
}
