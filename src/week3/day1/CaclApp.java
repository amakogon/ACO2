package week3.day1;

import java.util.Scanner;

public class CaclApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      printMenu();
      int choose = scanner.nextInt();
      if (choose == 0) {
        break;
      }
      if (choose < 0 || choose > 4) {
        continue;
      }
      System.out.println("Enter first value");
      int first = scanner.nextInt();
      System.out.println("Enter second value");
      int second = scanner.nextInt();
      int result = doAction(choose, first, second);
      System.out.println("Result = " + result);
    }

  }

   static int doAction(int action, int first, int second) {
    ICalculator calculator = new Calculator();
    int result = 0;
    switch (action) {
      case 1:
        result = calculator.sum(first, second);
        break;
      case 2:
        result = calculator.minus(first, second);
        break;
      case 3:
        result = calculator.multiplication(first, second);
        break;
      case 4:
        result = calculator.divide(first, second);
        break;
    }
    return result;
  }

  public static void printMenu() {
    System.out.println("Choose type of operation:\n");
    System.out.println("1. Sum");
    System.out.println("2. Minus");
    System.out.println("3. Multiplication");
    System.out.println("4. Divide");
    System.out.println("0. Exit");
  }
}
