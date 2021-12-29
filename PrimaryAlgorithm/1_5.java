class Solution {
    public int singleNumber(int[] nums) {
        int reduce = 0;
        for(int i=0;i<nums.length; i++){
            reduce = reduce ^ nums[i];
        }
        return reduce;
    }
}
