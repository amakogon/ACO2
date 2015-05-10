package week3.day2;

import week1.day2.MyInteger;

public class TestStack {
  public static void main(String[] args) {
    IStack stack = new MyStack();
    stack.push(4);
    stack.push(2);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    
    Object o = new String();
    Object b = 1;

    Integer i = 4; //Integer.valueOf(4);
    Double d = 4.5;
    MyInteger qweq = new MyInteger(123);
  }
}
