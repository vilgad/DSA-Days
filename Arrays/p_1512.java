public class p_1512 {
    public static void main(String[] args) {

    }

    // Best Solution
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        int count[] = new int[101];

        for (int i = 0; i < nums.length; ++i) {
            pairs = pairs + count[nums[i]];
            count[nums[i]]++;
        }

        return pairs;
    }

    // Brute Force approach
    public int numIdenticalPairs1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (i < j && nums[i] == nums[j])
                    count++;
            }
        }
        return count;
    }

    // Using Permutation Method 
    // but cant use because factorial values were too high and time complexuty was also high
    public int numIdenticalPairs2(int[] nums) {
        int count[] = new int[101];
        for (int i = 0; i < nums.length; ++i) {
            count[nums[i]]++;
        }

        int pairs = 0;
        for (int i = 0; i < count.length; ++i) {
            if (count[i] > 1)
                pairs += permutation(count[i]);
        }
        return pairs;
    }

    long permutation(int val) {
        return factorial(val) / (2 * factorial(val - 2));
    }

    long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
