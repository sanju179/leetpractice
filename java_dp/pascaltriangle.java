class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> dp = new ArrayList<>();
        
        dp.add(0,Arrays.asList(1));
        dp.add(1,Arrays.asList(1,1));

        if (rowIndex == 0 || rowIndex == 1) {
            return dp.get(rowIndex);
        }
        for (int i = 2; i<=rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            List x = dp.get(i-1);
            for (int j=0; j < x.size()-1; j++) {
                temp.add((int)x.get(j)+(int)x.get(j+1));
            }
            temp.add(1);
            dp.add(temp);
        }
        return dp.get(rowIndex);
    }
}
