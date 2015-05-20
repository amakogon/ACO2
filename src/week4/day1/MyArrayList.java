package week4.day1;

public class MyArrayList implements MyList {

  private static final int DEFAULT_SIZE = 16;
  private Object[] elements;
  private int index;

  public MyArrayList() {
    this(DEFAULT_SIZE);
  }

  public MyArrayList(int size) {
    elements = new Object[size];
  }

  @Override
  public void add(Object obj) {
    ensureCapacity();
    elements[index++] = obj;
  }

  private void ensureCapacity() {
    if (index >= elements.length) {
      Object[] newArray = new Object[elements.length * 2];
      System.arraycopy(elements, 0, newArray, 0, size());
      elements = newArray;
    }
  }

  @Override
  public Object get(int index) {
    return elements[index];
  }

  @Override
  public void remove(Object ibj) {

  }

  @Override
  public Object remove(int index) {
    Object obj = get(index);
    System.arraycopy(elements, index + 1, elements, index, size() - 1 - index);
    elements[--this.index] = null;
    return obj;
  }

  @Override
  public int size() {
    return index;
  }
}
