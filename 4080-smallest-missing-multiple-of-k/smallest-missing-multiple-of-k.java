class Solution {
    public int missingMultiple(int[] nums, int k) {
      int p=k;
      HashSet<Integer>set=new HashSet<>();
      for(int x:nums) set.add(x);
      while(set.contains(p)){
        p+=k;
      }
      return p;
    }
}