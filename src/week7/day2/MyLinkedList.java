package week7.day2;

import week4.day1.MyList;

public class MyLinkedList implements MyList {
  private Node tail;
  private int size;

  @Override
  public void add(Object obj) {
    if (tail == null) {
      tail = new Node(obj, null, null);
    } else {
      Node node = new Node(obj, null, tail);
      tail.next = node;
      tail = node;
    }
    size++;
  }

  @Override
  public Object get(int index) {
    return null;
  }

  @Override
  public void remove(Object ibj) {

  }

  @Override
  public Object remove(int index) {
    return null;
  }

  @Override
  public int size() {
    return size;
  }

  private class Node {
    Object value;
    Node next;
    Node prev;

    private Node(Object value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }


}
