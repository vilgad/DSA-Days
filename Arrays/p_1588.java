class p_1588 {
	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3};

		System.out.println(sumOddLengthSubarrays(arr));	
	}

	public static int sumOddLengthSubarrays(int[] arr) {
		int sum=0;
                for (int i=0; i<arr.length; ++i) {
                        for (int j=i; j<arr.length; ++j) {
                                for (int k=i; k<=j; ++k) {
                                        if ((j-i+1)%2 != 0)
                                                sum += arr[k];
                                }
                        }
                }
		return sum;
    	}

	 public int sumOddLengthSubarrays1(int[] arr) {
        int result = 0;
        int n = arr.length;

        for (int i=0; i<n; i++) {
            int end = i+1;
            int start = n-i;
            int total = start*end;
            int odd = total / 2;

            if (total %2 == 1) {
                odd++;
            }
            result += odd * arr[i];
        }

        return result;
    }
}
