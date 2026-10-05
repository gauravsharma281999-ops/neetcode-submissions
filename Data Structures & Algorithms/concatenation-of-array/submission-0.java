class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] doublenums=new int[nums.length*2];

        for(int i=0;i<2*nums.length;i++){
            int k=nums.length;
            if(i<nums.length){
                doublenums[i]=nums[i];
            }else{
               doublenums[i]=nums[i-k];
            }
        }
        return doublenums;
        
    }
}