package week1.day2;

public final class MyInteger implements Comparable<MyInteger> {
  private final int value;

  public MyInteger(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public MyInteger addInteger(MyInteger integer) {
    return new MyInteger(value + integer.value);
  }

  public boolean isSame(MyInteger integer) {
//    if(value == integer.value){
//      return true;
//    }
//    return false;
    return value == integer.value;
  }

  public String asString() {
    return value + "";
  }

  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj == this) {
      return true;
    }

    if (!(obj instanceof MyInteger)) {
      return false;
    }

    MyInteger other = ((MyInteger) obj);
    return value == other.value;
  }

  @Override
  public String toString() {
    return value + "";
  }

  @Override
  public int compareTo(MyInteger integer) {
//    if (value > integer.value) {
//      return 1;
//    } else if (value < integer.value) {
//      return -1;
//    }
//    return 0;
    return value > integer.value ? 1 : value < integer.value ? -1 : 0;
  }
}
