public class p_1480 {

    public static void main(String[] args) {
        
    }

    // brute force approach
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i=0; i<nums.length; ++i) {
            for (int j=0; j <= i; ++j) {
                arr[i] += nums[j];
            }
        }

        return arr;
    }

    // Optimized Solution
    public int[] runningSum1(int[] nums) {
        for (int i=1; i<nums.length; ++i) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

}