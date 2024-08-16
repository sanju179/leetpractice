class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> array = new HashMap<>();
        for (String i : arr) {
            array.put(i, array.getOrDefault(i,0)+1);
        }

        int count = 0;
        for (String s : arr) {
            
            if ((array.get(s) == 1) && ++count == k) {
                return s;
            }
            
        }
        return "";
    }
}
