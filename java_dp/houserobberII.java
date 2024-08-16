class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1) {
            return nums[0];
        }
        else if (n == 2) {
            return Math.max(nums[0],nums[1]);
        }

        // split into two arrays and solve
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        //System.out.println(arr1);
        for (int i=0;i<n;i++) {
            if (i!=0) {
                arr1[i] = nums[i];
            }
            if (i!=n-1) {
                arr2[i] = nums[i]; 
            } 
        }
        int ans1 = robb(arr1);
        int ans2 = robb(arr2);

        return Math.max(ans1,ans2);
    }

    public int robb(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;

        for (int i=1;i<n;i++) {
            int pick = nums[i];
            if (i>1) {
                pick += prev2;
            }
            int nonpick = 0 + prev;
            int curr = Math.max(nonpick,pick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
