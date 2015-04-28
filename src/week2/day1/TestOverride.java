package week2.day1;

public class TestOverride {
  public static void main(String[] args) {
    Developer developer = new Developer("Oleg", 500);
    Tester tester = new Tester("Viktor", 400);

    developer.doWork();
    tester.doWork();
  }
}
