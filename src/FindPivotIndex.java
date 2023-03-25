public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (int elements : nums)
            totalSum += elements;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum * 2 == totalSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
