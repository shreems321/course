public class maxProduct {
    public int maxproduct(int[]nums){
        if(nums == 0||nums.length ==0)
        return 0;

    }
    int maxProduct = nums[0];
    int minProduct = nums[0];
    int result = nums[0];

    for (int i = 1; i <nums.length; i++)
    if(nums[i] = 0){
        maxProduct = Math.max(nums[i], maxproduct * nums[i]);
        minProduct = Math.min(nums[i], minproduct * nums[i]);
    }
    else{
        int temp = maxProduct;
        maxProduct = Math.max(nums[i], maxProduct * nums[i]);
         minProduct = Math.min(nums[i], temp* nums[i]);
    }
    result = Math.max(result,maxProduct);
}
