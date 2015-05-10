package week3.day2;

import week1.day2.MyInteger;

public class CompareObjects {
  public static void main(String[] args) {
    MyInteger i1 = new MyInteger(3);
    MyInteger i2 = new MyInteger(10);

    if( i1.compareTo(i2) > 0 ) {
      System.out.println("i1 > i2");
    }
  }
}
