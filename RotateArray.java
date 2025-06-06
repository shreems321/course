public class RotateArray {
    public void rotate(int[]nums, int k){
        int n = nums.length;
        k = k%n;
        reverse(nums, 0 , n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }

    void reverse (int[]nums, int start, int end){
        int i = start, j = end;
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j++;

        }
    }
}
