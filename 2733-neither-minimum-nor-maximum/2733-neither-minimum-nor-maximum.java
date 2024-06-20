class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        if(nums.length <= 2)
            return -1;
        for(int i = 1; i < nums.length-1; i++){
                result = nums[i];
        }
        return result;
    }
}