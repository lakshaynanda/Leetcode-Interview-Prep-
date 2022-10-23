class Solution {
    int count = 0;
    public int countArrangement(int n) {
        boolean[] visited = new boolean[n + 1];
        calc(n, 1, visited);
        return count;
    }
    public void calc(int n, int pos, boolean[] visited) {
        if (pos > n) {
            count++;
        }
        for(int i = 1; i <= n; i++) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true;
                calc(n, pos + 1, visited);
                visited[i] = false;
            }
        }
    }
}