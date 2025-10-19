class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>set = new HashSet<>();


      for(int i:nums)set.add(i);
      int c = 1;

      for(int i=0;i<nums.length;i++){
        if(!set.contains(k * c)) return k * c;
        c++;
      }

      return c * k;
    }
}