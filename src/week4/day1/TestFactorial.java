package week4.day1;

public class TestFactorial {
  public static void main(String[] args) {
    System.out.println(factorial(15));


    for (int i = 1; i < 50; i++) {
      System.out.print(fib(i) + " ");
    }
    for (int i = 1; i < 50; i++) {
      System.out.print(fibRec(i) + " ");
    }

  }

  public static long factorial(int value) {
    long result = 1;
    for (long i = 2; i <= value; i++) {
      result *= i;
    }
    return result;
  }


  public static long factRec(long value) {
    if (value < 1) {
      return -1;
    }
    if (value < 3) {
      return value;
    }
    return value * factRec(value - 1);
  }

  public static int fib(int value) {

    int a = 1, b = 1;
    if (value < 3) {
      return 1;
    }
    int res = a + b;
    for (int i = 3; i <= value; i++) {
      res = a + b;
      a = b;
      b = res;
    }
    return res;

  }

  public static int fibRec(int val) {
    if (val < 3) {
      return 1;
    }
    return fibRec(val - 1) + fibRec(val - 2);
  }
}
