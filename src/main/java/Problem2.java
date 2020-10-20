public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    I have two values that go through the array, 'i' and 'deleter'. 'Deleter' is always one behind 'i', so it
    can compare the values from before to the one in front. if the number ahead ('i') is not the same as the one
    behind ('deleter'), we increment deleter, to make it follow 'i', and set the value ahead of nums[i] to the one
    behind nums[deleter], and increment the total index counter.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int totalIndex = 1;
        int deleter = 0;

        if(nums.length == 0)
        {
            return 0;
        }

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[deleter] )
            {
                deleter++;
                nums[deleter] = nums[i];
                totalIndex++;
            }
        }
        return totalIndex;
    }
}
