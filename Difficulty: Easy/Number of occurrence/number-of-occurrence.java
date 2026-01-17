class Solution {

    static int countFreq(int[] arr, int target) {
        int first = firstOccurence(arr, target);
        if (first == -1) return 0;
        int last = lastOccurence(arr, target);
        return last - first + 1;
    }

    public static int firstOccurence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                res = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    public static int lastOccurence(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                res = mid;
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
