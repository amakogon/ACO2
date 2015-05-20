package week4.day2;

public class TestInner {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();

    Outer.Nested nested = new Outer.Nested(4);

  }
}
