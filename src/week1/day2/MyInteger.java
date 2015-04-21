package week1.day2;

public class MyInteger {
  private int value;

  public MyInteger(int value){
    this.value = value;
  }

  public int getValue(){
    return value;
  }

  public void setValue(int value){
    this.value = value;
  }

  public void addInteger(MyInteger integer){
    value = value + integer.value;
  }

  public boolean isSame(MyInteger integer){
//    if(value == integer.value){
//      return true;
//    }
//    return false;
    return value == integer.value;
  }

  public String asString(){
    return value + "";
  }
}
