class Solution {
    public int findNonMinOrMax(final int[] nums) {
        int min = nums[0], max = nums[0], value = nums[0];

        for(final int num : nums) {
            if(min > num) {
                value = min;
                min = num;
            } else if(max < num) {
                value = max;
                max = num;
            } else {
                value = num;
            }

            if(value != max && value != min)
                return value;
        }

        return -1;
    }
}