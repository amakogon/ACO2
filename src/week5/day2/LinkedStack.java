package week5.day2;

import week3.day2.IStack;
import week5.day1.dynamic_ds.Node;

public class LinkedStack implements IStack {

  private Node top;
  private int size;

  @Override
  public void push(Object obj) {
//    Node node = new Node(obj, top);
//    top = node;
    top = new Node(obj, top);
    ++size;
  }

  @Override
  public Object pop() {
    Object obj = top.value;
    top = top.next;
    --size;
    return obj;
  }

  @Override
  public int size() {
    return size;
  }
}
