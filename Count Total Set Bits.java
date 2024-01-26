public class Solution {
    int mod = 1000000007;
    public int solve(int A) {
        long res = 0;
        for(int i = 1; i <= A; i++){
            res += Integer.bitCount(i);
        }
        return (int)(res % mod);
    }
}
