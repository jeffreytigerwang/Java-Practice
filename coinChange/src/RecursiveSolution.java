public class RecursiveSolution {
    public int coinChange(int[] coins, int amount) {
        if (amount < 1){
            return 0;
        }

        return coinHelper(coins, amount, new int[amount]);
    }

    private int coinHelper(int[] coins, int rem, int[] count) {
        if (rem < 0){
            return -1;
        }

        if (rem == 0){
            return 0;
        }

        if (count[rem - 1] != 0){
            return count[rem - 1];
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins){
            int res = coinHelper(coins, rem - coin, count);

            if (res >= 0 && res < min){
                min = res + 1;
            }
        }

        if (min < Integer.MAX_VALUE){
            count[rem - 1] = min;
        }
        else{
            count[rem - 1] = -1;
        }

        return count[rem - 1];
    }

}