package week3.day1;

import week1.day2.MyInteger;

public class TestStringBuilder {
  public static void main(String[] args) {
    String s = "";
//    for (int i = 0; i < 100000; i++) {
//      s += i;
//    }
//    System.out.println(s);


    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < 100000; i++) {
      builder.append(i);
    }
    String result = builder.toString();
//    System.out.println(result);

    System.out.println(new MyInteger(10));

    System.out.println("PI number = " + Math.PI + ", something");
    String.format("Pi number %.2f, something", Math.PI);
    System.out.printf("Floating point number with 3 decimal digits: %.3f\n",1.21312939123);




  }
}
