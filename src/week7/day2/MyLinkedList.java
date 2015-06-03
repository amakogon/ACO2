package week7.day2;

import week4.day1.MyList;

public class MyLinkedList implements MyList {
  private Node head;
  private Node tail;
  private int size;

  @Override
  public void add(Object obj) {
    if (head == null) {
      head = new Node(obj, null, null);
      tail = head;
    } else {
      Node node = new Node(obj, null, tail);
      tail.next = node;
      tail = node;
    }
    size++;
  }

  @Override
  public Object get(int index) {
    return find(index).value;
  }

  @Override
  public void remove(Object ibj) {

  }

  @Override
  public Object remove(int index) {
    Node nodeToRemove = find(index);

    if (head == nodeToRemove) {
      head = head.next;
      if (head == null) {
        tail = null;
      } else {
        head.prev = null;
      }
    } else if (tail == nodeToRemove) {
      tail = tail.prev;
      if (tail == null) {
        head = null;
      } else {
        tail.next = null;
      }
    } else {
      nodeToRemove.prev.next = nodeToRemove.next;
      nodeToRemove.next.prev = nodeToRemove.prev;
    }

    Object value = nodeToRemove.value;
    nodeToRemove = null; //help GC
    size--;
    return value;
  }

  @Override
  public int size() {
    return size;
  }

  private void checkRange(int index) {
    if (index < 0 || index > size() - 1) {
      throw new IndexOutOfBoundsException(String.valueOf(index));
    }
  }

  private Node find(int index) {
    checkRange(index);
    Node node;
    if (size() / 2 > index) {
      node = head;
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
    } else {
      node = tail;
      for (int i = size() - 1; i > index; i--) {
        node = node.prev;
      }
    }
    return node;
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
