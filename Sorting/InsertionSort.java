class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean is_swapped = False;
            for (int j = i+1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    is_swapped =  True;
                }
            }
            // No need to iterate
            if (is_swapped == False)
                break;
        }
    return nums;
    }    
}