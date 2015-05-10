package week3.day2;

public class MyStack implements IStack {

  private static final int DEFAULT_SIZE = 16;

  private Object[] elements;
  private int index;

  public MyStack() {
//    elements = new Object[16];
    this(DEFAULT_SIZE);
  }

  public MyStack(int size) {
    elements = new Object[size];
  }

  @Override
  public void push(Object obj) {
    ensureCapacity();
    elements[index++] = obj;
  }

  @Override
  public Object pop() {
    Object obj = elements[index - 1];
    elements[--index] = null;
    return obj;
  }

  @Override
  public int size() {
    return index;
  }

  public void someMethod() {
  }

  private void ensureCapacity(){
    //check array size
    //create new array
    //copy elemenets into new array
  }

}
