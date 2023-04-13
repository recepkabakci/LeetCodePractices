import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        HashSet hashSet = new HashSet();
        int numbers = 0;
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        Iterator itr = hashSet.iterator();

        while (itr.hasNext()) {
            numbers = (int) itr.next();
        }
        return numbers;

    }
}
