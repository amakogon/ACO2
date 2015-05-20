package week5.day2;

import week3.day2.IStack;
import week3.day2.MyStack;

public class TestLinkedStack {
  public static void main(String[] args) {
    IStack stack = new LinkedStack();
    stack.push(1);
    stack.push(2);
    System.out.println(String.format("stack size = %d", stack.size()));

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(String.format("stack size = %d", stack.size()));
  }
}
