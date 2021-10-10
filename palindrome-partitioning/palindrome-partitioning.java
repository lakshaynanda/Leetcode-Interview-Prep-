class Solution {
    public List<List<String>> partition(String s) {
        int length = s.length();
        List<List<String>> answer = new ArrayList<>();
        if(s == null || s.length() == 0) {
            return answer;
        }
        boolean dp[][] = new boolean[s.length()][s.length()];
        
        for(int gap = 0; gap < s.length(); gap++) {
            for(int i = 0, j = gap; j < s.length(); i++, j++) {
                if(gap == 0) {
                    dp[i][j] = true;
                } else if (gap == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if(s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        backtrack(s, 0, length, dp, answer, new ArrayList<>());
        return answer;
    }
    public void backtrack(String s, int start, int length, boolean[][] dp, List<List<String>> answer, List<String> list) {
        if(start == length) {
            answer.add(new ArrayList<>(list));
        }
        for(int end = start; end < length; end++) {
            if(dp[start][end]) {
                list.add(s.substring(start, end + 1));
                backtrack(s, end + 1, length, dp, answer, list);
                list.remove(list.size() - 1);
            }
        }
    }
}