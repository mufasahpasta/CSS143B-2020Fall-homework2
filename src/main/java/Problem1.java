public class Problem1 {

    /*
    Describe your algorithm here in up to 5 sentences:
    To describe this, think of each number/color having its own boundaries; 0 is left, and 2 is right, but we
    don't bother with 1. We start at index 0, and if the number is 0, we swap numbers and increase the boundary
    size, if its 1, we just increase the boundary size for 1, and if it is 2, we increase the size by removing
    space from the boundary of 1. We don't bother with 1 because if you get all the 0's to the left and all the
    2's to the right, all the 1's will end up in the middle automatically.
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int left = 0;
        int temp = 0;
        int right = nums.length - 1;
        int reader = 0;
        while(reader <= right)
        {
            if(nums[reader] == 0)
            {
                temp = nums[reader];
                nums[reader] = nums[left];
                nums[left] = temp;
                left++;
                reader++;
            }
            else if(nums[reader] == 1)
            {
                reader++;
            }

            else if(nums[reader] == 2)
            {
                temp = nums[reader];
                nums[reader] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
}
