package week4.day2;

import java.util.Arrays;
import java.util.Comparator;

public class TestCOins {
  public static void main(String[] args) {
    Coin[] coins = new Coin[3];
    coins[0] = new Coin(50, 8);
    coins[1] = new Coin(10, 4);
    coins[2] = new Coin(5, 10);

    System.out.println(Arrays.toString(coins));
    for (int j = 0; j < coins.length; j++) {
      for (int i = 0; i < coins.length - 1 - j; i++) {
        if (coins[i].compareTo(coins[i + 1]) > 0) {
          Coin temp = coins[i];
          coins[i] = coins[i + 1];
          coins[i + 1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(coins));

    Arrays.sort(coins, new CoinSizeComparator());
    System.out.println(Arrays.toString(coins));

  }

  public static class CoinSizeComparator implements Comparator<Coin>{

    @Override
    public int compare(Coin coin1, Coin coin2) {
      return coin1.getCoinSize() > coin2.getCoinSize() ? 1 :
        coin1.getCoinSize() < coin2.getCoinSize() ? -1 : 0;
    }
  }
}
