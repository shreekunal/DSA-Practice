class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // Calculate the middle index

            // If mid element is the target, return its index
            if (nums[mid] == target)
                return mid;

            // Check if the left half is sorted
            if (nums[low] <= nums[mid]) { 
                // If target is in the sorted left half
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Search in the left half
                } else {
                    low = mid + 1; // Search in the right half
                }
            } 
            // Otherwise, the right half must be sorted
            else { 
                // If target is in the sorted right half
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1; // Search in the right half
                } else {
                    high = mid - 1; // Search in the left half (corrected)
                }
            }
        }
        return -1; // Target not found
    }
}
