public class IterativeSolution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;

        for (int i = 1; i < amount + 1; i++){
            int min = Integer.MAX_VALUE;
            for (int coin : coins){
                if (i >= coin && dp[i - coin] != -1){
                    min = Math.min(dp[i - coin], min);
                }
            }

            if (min != Integer.MAX_VALUE){
                dp[i] = min + 1;
            }
            else{
                dp[i] = -1;
            }
        }
        return dp[amount];
    }
}
