package week2.day2;

import week1.day2.MyInteger;
import week2.day1.Developer;

public class TestEquals {
  public static void main(String[] args) {
    MyInteger i1 = new MyInteger(5);
    MyInteger i2 = new MyInteger(5);
    MyInteger i3 = new MyInteger(3);
    MyInteger i4 = new MyInteger(5);
    MyInteger i5 = i1;

    System.out.println(i1.equals(i2) && i2.equals(i1));
    System.out.println(i1.equals(i2) && i2.equals(i4) && i1.equals(i4));

    System.out.println(i1.equals(i3));
    System.out.println(i1.equals(null));
    System.out.println(i1.equals(new Developer("Artem", 10)));




  }
}
