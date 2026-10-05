class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
        }

        int s=ans.size();

        return s!=nums.length;
        
    }
}