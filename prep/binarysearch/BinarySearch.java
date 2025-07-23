package binarysearch;

public class BinarySearch {

    public static int isTargetIn(int[] nums, int target) {
        if(nums == null) throw new NullPointerException();
        if(nums.length == 1) {
            if (nums[0] == target) return 0;
            else if(nums[0] != target) return -1;
        }
        if(nums.length == 2) {
            if(nums[0] == target) return 0;
            else if(nums[1] == target) return 1;
            else return -1;
        }

        int low = 0;
        int high = nums.length - 1;
        int mid;

        while(low != high - 1) {
            mid = (low + high) / 2;

            if(nums[low] == target) return low; 
            else if(nums[high] == target) return high;
            else if(nums[mid] == target) return mid;

            if(target < nums[mid]) high = mid;
            else if(target > nums[mid]) low = mid;
        }

        return -1;
    }
}
