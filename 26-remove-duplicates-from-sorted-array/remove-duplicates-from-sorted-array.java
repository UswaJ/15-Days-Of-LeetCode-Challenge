class Solution {
    public int removeDuplicates(int[] nums) {
        
    
        if (nums.length == 0) {
            return 0;
        }

        int first_is_unique = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[first_is_unique - 1]) {
                nums[first_is_unique] = nums[i];
                first_is_unique++;
            }
        }

        return first_is_unique;
    }
}