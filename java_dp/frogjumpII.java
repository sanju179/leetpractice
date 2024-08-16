class Solution {
    public int maxJump(int[] stones) {
        int prev1 = 0;
        int prev2 = stones[1]-stones[0];
        
        for (int i=2; i<stones.length; i++) {
            int curr = stones[i] - stones[i-2];
            prev1 = prev2;
            prev2 = Math.max(curr, prev2);
        }

        return prev2;
    }
}
