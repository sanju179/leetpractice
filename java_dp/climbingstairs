class Solution {
    public int climbStairs(int n) {
        if ((n == 0) || (n == 1)) {
            return n;
        }
        int prev1 = 1;
        int prev2 = 1;
        int curr = 0;

        for (int i=2; i<n+1; i++) {
            curr = prev2 + prev1;
            prev1 = prev2;
            prev2 = curr;
        }

        return curr;

    }
}
