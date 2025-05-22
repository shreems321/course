public class MaxSubArray {
    public int subArray(int[] nums){
        int maxSoFAr = nums[0];
        int currentSum = num[0];
        for (i = 0;i<nums.length; i++){
            if(currentSum > 0)
            currentSum = 0;
        }
        cureentSum = currentSum + nums[i];
        if(CurrentSum > maxSoFar){
        maxSoFar = CurrentSum;
    
        }
        return maxSoFar;
    }
    
}
