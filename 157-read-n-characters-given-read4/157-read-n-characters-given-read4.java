/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf4);
 */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int copied = 0;
        int read = 4;
        char[] buf4 = new char[4];
        
        while(copied < n && read == 4) {
            read = read4(buf4);
            for(int i = 0; i < read; i++) {
                if (copied == n) {
                    return copied;
                }
                buf[copied++] = buf4[i];
            }
        }
        return copied;
    }
}