package week7.day2;

import week4.day1.MyArrayList;
import week4.day1.MyList;

public class TestList {
  public static void main(String[] args) {
    MyList list = new MyLinkedList();
    list.add(5);
    list.add(2);
    list.add(3);

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));

    list.remove(1);
    System.out.println("~~~~~~~~");
    System.out.println(list.get(0));
    System.out.println(list.get(1));

    list.remove(0);
    System.out.println("~~~~~~~~");
    System.out.println(list.get(0));
    list.add(10);

    list.remove(1);
    System.out.println("~~~~~~~~");
    System.out.println(list.get(0));

  }
}
