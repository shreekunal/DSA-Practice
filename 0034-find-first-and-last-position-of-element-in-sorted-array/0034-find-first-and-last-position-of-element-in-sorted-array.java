class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = { -1, -1 };
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (low < nums.length && nums[low] == target)
            arr[0] = low;
        else
            return arr;
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        arr[1] = high;
        return arr;
    }
}