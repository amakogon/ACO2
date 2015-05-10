package week1.day2;

public class TestInt {
  public static void main(String[] args) {
    MyInteger i1 = new MyInteger(3);
    System.out.println(i1.getValue());

    MyInteger i2 = new MyInteger(5);
    i1 = i1.addInteger(i2);
    System.out.println(i1.getValue());


    MyInteger first = new MyInteger(3);
    MyInteger second = new MyInteger(3);

//    if(first.getValue() == second.getValue()){
//      System.out.println(true);
//    }else {
//      System.out.println(false);
//    }
    System.out.println(first.isSame(second));

    System.out.println(first.asString());
  }
}
