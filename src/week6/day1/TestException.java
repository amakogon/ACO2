package week6.day1;

public class TestException {
  public static void main(String[] args) {
    try {
      if (Math.random() < 0.5) {
        throw new MyCustomException("shit happened");
      } else {
        throw new Exception();
      }
    } catch (MyCustomException ex) {
      ex.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
