package week4.day2;

public class Coin implements Comparable<Coin> {
  private int value;
  private int coinSize;

  public Coin(int value, int coinSize) {
    this.value = value;
    this.coinSize = coinSize;
  }

  public int getValue() {
    return value;
  }

  public int getCoinSize() {
    return coinSize;
  }

  @Override
  public String toString() {
    return "Coin{" +
      "value=" + value +
      ", coinSize=" + coinSize +
      '}';
  }

  @Override
  public int compareTo(Coin coin) {
    return value > coin.value ? 1 :
      value < coin.value ? -1 : 0;
  }
}
