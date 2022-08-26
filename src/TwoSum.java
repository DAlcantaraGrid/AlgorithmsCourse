public class TwoSum {

    public int maxSubArray(int[] nums) {
        int maxFar = nums[0];
        int maxHere = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(nums[i] > maxHere + nums[i]){
                maxHere = nums[i];
            }else{
                maxHere = maxHere + nums[i];
            }

            if(maxFar < maxHere){
                maxFar = maxHere;
            }
        }

        return maxFar;
    }
}
