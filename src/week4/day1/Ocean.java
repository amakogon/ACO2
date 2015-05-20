package week4.day1;

public enum Ocean {
  PACIFIC(169.2), ATLANTIC(91.6), INDIAN(73.56), ARCTIC(14.75);

  private double square;

  private Ocean(double square) {
    this.square = square;
  }

  public double getSquare() {
    return square;
  }
}
