import java.util.HashSet;
import java.util.Set;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {

            int [] result = null;
            Set<Integer> set = new HashSet<>();

            if(nums == null || nums.length < 2) {
                return null;
            }

            for(int i = 0; i < nums.length; i++){
                int value = target - nums[i];
                if(set.contains(value)){
                    result = new int[2];
                    result[1] = nums[i];
                    result[0] = value;
                    break;
                }
                set.add(nums[i]);
            }

            return result;
        }
}
