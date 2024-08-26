package src.java.leetcode.medium;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
//        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
//        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
//        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
//        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsert(new int[]{1}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }

            if (target < nums[0]) {
                return 0;
            }

            if (i + 1 <= nums.length - 1) {
                if (nums[i] < target && target < nums[i + 1]) {
                    return i + 1;
                }
            }
        }
        return nums.length;
    }
}
