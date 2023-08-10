public class p_1672 {
    public static void main(String[] args) {
        
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        // Brute Force
        for(int i=0; i<accounts.length; i++) {
            int sum = 0;
            for (int j=0; j<accounts[i].length; ++j) {
                sum += accounts[i][j];
            }

            if (sum > maxWealth) 
                maxWealth = sum;
        }

        return maxWealth;
    }
}
