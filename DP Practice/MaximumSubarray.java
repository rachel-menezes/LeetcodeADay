//https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
        
    int max_sub = nums[0];
    int curr_max = nums[0];
    
    for(int i =1; i< nums.length; i++){
        
        curr_max = Math.max(nums[i], nums[i]+curr_max);
        max_sub = Math.max(curr_max, max_sub);
    }   
        
    return max_sub;
    }
}