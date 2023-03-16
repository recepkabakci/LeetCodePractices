import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int a[]=new int[nums.length];
        int result=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    result=i;
                    break;
                }else{
                  for(int j=0;j<nums.length;j++){
                      a[j]=nums[j];
                      a[nums.length]=target;
                      Arrays.sort(a);
                      result=Arrays.binarySearch(a,target);
                  }
                }
            }
            return  result;
    }
}
