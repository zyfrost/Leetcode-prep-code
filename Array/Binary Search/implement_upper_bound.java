class Solution {
    public int upperBound(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;

            } else {
                low = low + 1;
            }
        }
        return ans;
    }
}
