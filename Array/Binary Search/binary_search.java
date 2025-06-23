class Solution {
    public int search(int[] nums, int target) {
        int low = nums[0];
        int high = nums.length - 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int mid = (high - low) / 2;
            if (nums[i] > target) {
                low = mid + 1;
                low++;
            } else if (nums[i] < target) {
                high = mid - 1;
                high--;
            } else if (nums[i] == target) {
                mid = i;
                return mid;

            }
        }
        return -1;
    }
}