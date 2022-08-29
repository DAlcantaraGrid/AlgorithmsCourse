import java.util.HashSet;
import java.util.Set;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {

            int [] result = null;

            if(nums == null || nums.length < 2){
                return null;
            }

            Set<Integer> set = new HashSet<>();

            for(int i = 0; i < nums.length; i++){
                int value = target - nums[i];
                if(set.contains(value)){
                    result = new int[2];
                    result[0] = nums[i];
                    result[1] = value;
                    i = nums.length + 1;
                }
                set.add(nums[i]);
            }

            return result;
        }
}
