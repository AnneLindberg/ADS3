package Coins;

public class CoinsMain {

    public static void main(String[] args) {
        int coins[] = {1,7,10,22};
        int sum = 200;

        Coins coin = new Coins(coins,sum);
        System.out.println("You need at least " + coin.coinChange(coins, sum) + " coins to to make a value of " + sum);
    }
}

