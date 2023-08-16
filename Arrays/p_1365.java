public class p_1365 {
    public static void main(String[] args) {
        
    }

    // Brute Force
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // to store the number of smaller elements
        int arr[] = new int[nums.length];

        for (int i=0; i<nums.length; ++i) {
            // Traversing the array for each nums[i]
            for (int j=0; j < nums.length; ++j) {
                // store smaller elements in arr
                if (nums[j] < nums[i])
                    arr[i]++;
            }
        }

        return arr;
    }

    public int[] smallerNumbersThanCurrent1(int[] nums) {
        // to store occurences of nums[i]
        int arr[] = new int[101];
        // to store numbers smaller than nums[i]
        int ans[] = new int[nums.length];

        // calculating and storing occurences of nums[i] in arr
        for (int i=0; i<nums.length; ++i) 
            arr[nums[i]]++;

        // Running sum of arr array
        for (int i=1; i<101; ++i)
            arr[i] = arr[i] + arr[i-1];

        // storing numbers smaller than nums[i] in ans[i]
        for (int i=0; i<nums.length; ++i) {
            if (nums[i] == 0) 
                ans[i] = 0;
            else
                ans[i] = arr[nums[i] -1];
        }
        return ans;
    }
}
