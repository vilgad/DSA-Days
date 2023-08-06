public class p_1470 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 5, 3, 5, 3 };

		shuffle(nums, 3);
	}

// time complexity O(n) & Space Complexity O(1)
	static int[] shuffle(int[] nums, int n) {
		if (checkConstraints(nums, n)) {
			int[] arr = new int[2 * n];

			for (int i = 0, j = 0; i < n; i++, j += 2) {
				arr[j] = nums[i];
				arr[j + 1] = nums[i + n];
			}

			return arr;
		}

		return new int[n];
	}

	// time complexity O(n) & Space Complexity O(1)
	static int[] approach1(int[] nums, int n) {
		int len = nums.length;
		
		// to store the pair of numbers in right half of the original array
        for(int i = n; i < len; i++) {
            nums[i] = (nums[i] * 1024) + nums[i - n];
        }
        
        int index = 0;
		// to retrive values from the pair of numbers and placing those retrieved value at their desired position
        for(int i = n; i < len; i++, index += 2) {
            nums[index] = nums[i] % 1024;
            nums[index + 1] = nums[i] / 1024;
        }
        
        return nums;
	}

	// static int[] approach2(int[] nums, int n) {
	// 	for (int i=0; i<nums.length; ++i) {
	// 		int currNum = nums[i];
	// 		int currPos = i;

	// 		while (currNum > 0) {
	// 			int newPos = 0;
	// 			if (currPos < n) {
	// 				newPos = 2*currPos;
	// 			} else {
	// 				newPos = 2 * (currPos - n) +1;
	// 			}

	// 			int newNum = nums[newPos];
	// 			nums[newPos] = -currNum;
	// 			currNum = newNum;
	// 			currPos = newPos;
	// 		}
	// 	}

	// 	for (int i=0; i<nums.length; ++i) {
	// 		if (nums[i] < 0)
	// 			nums[i] = -nums[i];
	// 	}

	// 	return nums;
	// }

	static boolean checkConstraints(int[] nums, int n) {
		if (!(n >= 1 && n <= 500))
			return false;

		if (!(nums.length == 2 * n))
			return false;

		for (int i = 0; i < n; i++) {
			if (!(nums[i] >= 1 && nums[i] <= 1000))
				return false;
		}

		return true;
	}
}
