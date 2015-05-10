package week3.day1;

public class Calculator implements ICalculator{

  public int sum(int a, int b) {
    return a + b;
  }

  public int minus(int a, int b) {
    return a - b;
  }

  @Override
  public int divide(int a, int b) {
    return a / b;
  }

  @Override
  public int multiplication(int a, int b) {
    return a * b;
  }
}
