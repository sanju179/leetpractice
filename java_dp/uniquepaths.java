class Solution {
    public int uniquePaths(int i, int j) {
        return count(i,j);      
        }
    
    public int count(int i, int j) {
        return countWays(i, j);
    }
    public int countWays(int i, int j) {
       int[] prev = new int[j];
        for (int m=0;m<i;m++) {
            int[] temp = new int[j];
            for (int n=0;n<j;n++) {
                if (m == 0 && n == 0) {
                    temp[m] = 1;
                    continue;
                }
                int down = 0;
                int right = 0;
                if (m>0) {
                    down = prev[n];
                }
                if (n>0) {
                    right = temp[n-1];
                }
                temp[n] = down + right;
            }
            prev = temp;
            }
        return prev[j-1];
        }
        

    }
