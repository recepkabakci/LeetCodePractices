public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int sum[]= new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i+1;j++){
                sum[i]+=nums[j];
            }
        }
        return sum;
    }
}
