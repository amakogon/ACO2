package week4.day1;

public class TestOcean {
  public static void main(String[] args) {
    Ocean ocean = Ocean.INDIAN;
    System.out.println(ocean.getSquare());

    for (int i = 0; i < Ocean.values().length; i++) {
      System.out.println(Ocean.values()[i]);
    }

    Ocean pacific = Ocean.valueOf("PACIFIC");
    Ocean pacific1 = Ocean.valueOf("PACIFIC");
    System.out.println(String.format("%s square = %.2f", pacific, pacific.getSquare()));


  }
}
