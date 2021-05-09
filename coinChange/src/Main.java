public class Main {
    public static void main(String[] args){
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        RecursiveSolution answer = new RecursiveSolution();
        System.out.print(answer.coinChange(coins, amount));
    }
}
