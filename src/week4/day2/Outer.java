package week4.day2;

public class Outer {
  private int a;
  private static int staticField;

  public int getA() {
    System.out.println();
    return a;
  }

  public void someMethod(){
    Nested nested = new Nested(5);
    System.out.println(nested.getG());
  }

  public static class Nested{
    private int g;

    public Nested (int g) {
      this.g = g;
    }

    public void some(){
      System.out.println(staticField);
    }

    public int getG() {
      return g;
    }
  }

  public class Inner{
    private int b;

    public int getB() {
      System.out.println(a);
      getA();
      return b;
    }
  }

}
