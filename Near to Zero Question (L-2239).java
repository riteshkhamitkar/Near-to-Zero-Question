class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        for(int a: nums){
            if(Math.abs(a)<Math.abs(ans)){
                ans = a;
            }
            if(Math.abs(a)== Math.abs(ans) && a>ans){
                ans = a;
            }
        }
        return ans;
    }
}