package Coins;

public class Coins {

    int coins[] = {1,7,10,22};
    int sum = 100;

    public Coins(int[] coins, int sum)
        {
            this.coins = coins;
            this.sum = sum;
        }

    public int coinChange(int[] coins, int sum){
        int totalCoins = coins.length;
        double[][] arr = new double[totalCoins + 1][sum + 1];
        for(int j = 0; j <= sum; j++){
            arr[0][j] = Double.POSITIVE_INFINITY;
        }
        for(int i = 1; i <= totalCoins; i++){
            arr[i][0] = 0;
        }

        for(int i = 1; i <= totalCoins; i++){
            for(int j = 1; j <= sum; j++){
                if(coins[i - 1] <= j)
                    arr[i][j] = min(1 + arr[i][j - coins[i - 1]], arr[i - 1][j]);
                else
                    arr[i][j] = arr[i - 1][j];
            }
        }

        return (int)arr[totalCoins][sum];
    }

    private double min(double v, double v1) {
        if(v <= v1){
            return v;
        }
        else{
            return v1;
        }
    }




}
