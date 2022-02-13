class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
        
        for(int t : tasks) {
            freq[t - 'A']++;
        }
        int fmax = 0;
        for(int f : freq) {
            fmax = Math.max(fmax, f);
        }
        
        int nmax = 0;
        
        for(int f : freq) {
            if (f == fmax) {
                nmax++;
            }
        }
        return Math.max(tasks.length, (fmax - 1) * (n + 1) + nmax);
    }
}